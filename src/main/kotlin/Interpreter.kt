import org.opency.pseudocode.grammar.pseudocodeBaseVisitor
import org.opency.pseudocode.grammar.pseudocodeLexer
import org.opency.pseudocode.grammar.pseudocodeParser
import kotlin.text.get

class Interpreter : pseudocodeBaseVisitor<Value>() {
    internal var globalEnv = Environment()
    private var currentEnv = globalEnv

    // Special exception for return statements
    class ReturnException(val value: Value) : Exception()

    init {
        // Register built-in functions
        registerBuiltins()
    }

    private fun registerBuiltins() {
        // length function
        globalEnv.define("length", Value.BuiltinFunction("length", 1) { args ->
            when (val arg = args[0]) {
                is Value.Array -> Value.Number(arg.length().toDouble())
                else -> throw RuntimeException("length() requires an array")
            }
        })
    }

    override fun visitProgram(ctx: pseudocodeParser.ProgramContext): Value {
        // Visit all algorithm declarations
        ctx.algorithmDecl().forEach { visit(it) }

        return Value.Null
    }

    override fun visitAlgorithmDecl(ctx: pseudocodeParser.AlgorithmDeclContext): Value {
        val name = ctx.ID().text
        val params = ctx.paramList()?.ID()?.map { it.text } ?: emptyList()
        val body = ctx.block()

        val function = Value.Function(params, body, currentEnv)
        globalEnv.define(name, function)

        return Value.Null
    }

    override fun visitAssignment(ctx: pseudocodeParser.AssignmentContext): Value {
        val value = visit(ctx.expression(0))

        if (ctx.expression().size == 1) {
            // Simple assignment: x ← value
            currentEnv.set(ctx.ID().text, value)
        } else {
            // Array assignment: A[i] ← value
            val arrayName = ctx.ID().text
            val array = currentEnv.get(arrayName) as? Value.Array
                ?: throw RuntimeException("$arrayName is not an array")

            val index = visit(ctx.expression(0)).toKotlinDouble().toInt()
            array.set(index, value)
        }

        return Value.Null
    }

    override fun visitIfStatement(ctx: pseudocodeParser.IfStatementContext): Value {
        val expressions = ctx.expression()
        val blocks = ctx.block()

        // Check main if condition
        if (visit(expressions[0]).toKotlinBoolean()) {
            return visit(blocks[0])
        }

        // Check else if conditions
        var blockIndex = 1
        for (i in 1 until expressions.size) {
            if (visit(expressions[i]).toKotlinBoolean()) {
                return visit(blocks[blockIndex])
            }
            blockIndex++
        }

        // Else block (if present)
        if (blockIndex < blocks.size) {
            return visit(blocks[blockIndex])
        }

        return Value.Null
    }

    override fun visitWhileStatement(ctx: pseudocodeParser.WhileStatementContext): Value {
        while (visit(ctx.expression()).toKotlinBoolean()) {
            visit(ctx.block())
        }
        return Value.Null
    }

    override fun visitForStatement(ctx: pseudocodeParser.ForStatementContext): Value {
        val loopVar = ctx.ID().text

        if (ctx.getChild(1).text == "each") {
            // for each element in collection
            val collection = visit(ctx.expression(0))
            when (collection) {
                is Value.Array -> {
                    for (element in collection.elements) {
                        currentEnv.set(loopVar, element)
                        visit(ctx.block())
                    }
                }
                is Value.Set -> {
                    for (element in collection.elements) {
                        currentEnv.set(loopVar, element)
                        visit(ctx.block())
                    }
                }
                else -> throw RuntimeException("for each requires a collection")
            }
        } else {
            // for i ← start to end
            val start = visit(ctx.expression(0)).toKotlinDouble().toInt()
            val end = visit(ctx.expression(1)).toKotlinDouble().toInt()

            for (i in start..end) {
                currentEnv.set(loopVar, Value.Number(i.toDouble()))
                visit(ctx.block())
            }
        }

        return Value.Null
    }

    override fun visitRepeatStatement(ctx: pseudocodeParser.RepeatStatementContext): Value {
        do {
            visit(ctx.block())
        } while (!visit(ctx.expression()).toKotlinBoolean())

        return Value.Null
    }

    override fun visitReturnStatement(ctx: pseudocodeParser.ReturnStatementContext): Value {
        val value = visit(ctx.expression())
        throw ReturnException(value)
    }

    override fun visitExpression(ctx: pseudocodeParser.ExpressionContext): Value {
        println("Visiting expression: ${ctx.text}")
        // Floor/ceiling
        if (ctx.FLOOR_OPEN() != null) {
            val value = visit(ctx.expression(0)).toKotlinDouble()
            return Value.Number(kotlin.math.floor(value))
        }
        if (ctx.CEIL_OPEN() != null) {
            val value = visit(ctx.expression(0)).toKotlinDouble()
            return Value.Number(kotlin.math.ceil(value))
        }

        // Binary operations
        if (ctx.expression().size == 2) {
            val left = visit(ctx.expression(0))
            val right = visit(ctx.expression(1))
            val op = ctx.getChild(1).text

            if(ctx.NOT_IN() != null) {
                    val set = right as? Value.Set
                        ?: throw RuntimeException("∉ requires a set on right side")
//                    Value.Boolean(!set.elements.contains(left))
                return Value.Boolean(!set.elements.contains(left))
            }

            return when (op) {
                "+", "-", "×", "*", "÷", "/" -> {
                    val l = left.toKotlinDouble()
                    val r = right.toKotlinDouble()
                    Value.Number(when (op) {
                        "+" -> l + r
                        "-" -> l - r
                        "×", "*" -> l * r
                        "÷", "/" -> l / r
                        else -> throw RuntimeException("Unknown operator: $op")
                    })
                }
                "=", "≠", "<", ">", "≤", "≥", "<>", "<=", ">=" -> {
                    val l = left.toKotlinDouble()
                    val r = right.toKotlinDouble()
                    Value.Boolean(when (op) {
                        "=" -> l == r
                        "≠" -> l != r
                        "<>" -> l != r
                        "<" -> l < r
                        ">" -> l > r
                        "≤" -> l <= r
                        "<=" -> l <= r
                        "≥" -> l >= r
                        ">=" -> l >= r
                        else -> throw RuntimeException("Unknown operator: $op")
                    })
                }
                "∈", "in" -> {
                    val set = right as? Value.Set
                        ?: throw RuntimeException("∈ requires a set on right side")
                    Value.Boolean(set.elements.contains(left))
                }
//                "∉" -> {
//                pseudocodeLexer.NOT_IN -> {
//                    val set = right as? Value.Set
//                        ?: throw RuntimeException("∉ requires a set on right side")
//                    Value.Boolean(!set.elements.contains(left))
//                }
                "∪" , "|"-> {
                    val leftSet = left as? Value.Set
                        ?: throw RuntimeException("∪ requires sets")
                    val rightSet = right as? Value.Set
                        ?: throw RuntimeException("∪ requires sets")
                    Value.Set((leftSet.elements + rightSet.elements).toMutableSet())
                }
                "∩", "&" -> {
                    val leftSet = left as? Value.Set
                        ?: throw RuntimeException("∩ requires sets")
                    val rightSet = right as? Value.Set
                        ?: throw RuntimeException("∩ requires sets")
                    Value.Set(leftSet.elements.intersect(rightSet.elements).toMutableSet())
                }
                else -> throw RuntimeException("Unknown operator: $op")
            }
        }

        // Function call
        println(ctx.ID())
        println(ctx.argList())
        if (ctx.ID() != null && ctx.argList() != null) {
            println("Inside function call")
            val funcName = ctx.ID().text
            val func = currentEnv.get(funcName)
            val args = ctx.argList()?.expression()?.map { visit(it) } ?: emptyList()
            args.forEach { println(it.toString()) }

            return when (func) {
                is Value.Function -> callFunction(func, args)
                is Value.BuiltinFunction -> {
                    if (args.size != func.arity) {
                        throw RuntimeException("Function '${func.name}' expects ${func.arity} arguments, but got ${args.size}")
                    }
                    func.function(args)
                }
                else -> throw RuntimeException("$funcName is not a function")
            }
        }

        // Array access
        if (ctx.getChild(1)?.text == "[") {
            val arrayName = ctx.ID().text
            val array = currentEnv.get(arrayName) as? Value.Array
                ?: throw RuntimeException("$arrayName is not an array")
            val index = visit(ctx.expression(0)).toKotlinDouble().toInt()
            return array.get(index)
        }

        // Delegate to primary
        return visit(ctx.primary())
    }

    override fun visitPrimary(ctx: pseudocodeParser.PrimaryContext): Value {
        return when {
            ctx.NUMBER() != null -> Value.Number(ctx.NUMBER().text.toDouble())
            ctx.STRING() != null -> {
                val text = ctx.STRING().text
                Value.String(text.substring(1, text.length - 1)) // Remove quotes
            }
            ctx.ID() != null -> {
                println("ctx id is: ${ ctx.ID().text }")
                currentEnv.get(ctx.ID().text)
            }
            ctx.text == "true" -> Value.Boolean(true)
            ctx.text == "false" -> Value.Boolean(false)
            ctx.text == "null" -> Value.Null
            ctx.text == "∞" || ctx.text == "inf" -> Value.Infinity
            ctx.text == "∅" -> Value.EmptySet
            ctx.expression() != null -> visit(ctx.expression())
            ctx.getChild(0).text == "[" -> {
                // Array literal
                val elements = ctx.argList()?.expression()?.map { visit(it) }?.toMutableList()
                    ?: mutableListOf()
                Value.Array(elements)
            }
            ctx.getChild(0).text == "{" -> {
                // Set literal
                if(ctx.setElements() == null) {
                    Value.EmptySet  // {}
                } else {
                    val elements = ctx.setElements().expression().map { visit(it) }.toMutableSet()
                    Value.Set(elements)
                }
            }
            else -> throw RuntimeException("Unknown primary: ${ctx.text}")
        }
    }

    internal fun callFunction(func: Value.Function, args: List<Value>): Value {
        if (args.size != func.params.size) {
            throw RuntimeException("Expected ${func.params.size} arguments, got ${args.size}")
        }

        // Create new environment for function scope
        val previousEnv = currentEnv
        currentEnv = func.closure.createChild()

        // Bind parameters
        func.params.zip(args).forEach { (param, arg) ->
            currentEnv.define(param, arg)
        }

        return try {
            visit(func.body)
            Value.Null // If no return statement
        } catch (e: ReturnException) {
            e.value
        } finally {
            currentEnv = previousEnv
        }
    }

    fun reset() {
        globalEnv = Environment()
        currentEnv = globalEnv
        registerBuiltins()
    }

    fun runFunction(name: String, args: List<Value>): Value {
        val func = globalEnv.get(name)
        if (func is Value.Function) {
            return callFunction(func, args)
        }
        return Value.Null
    }
}
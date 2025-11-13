import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.BaseErrorListener
import org.antlr.v4.runtime.RecognitionException
import org.antlr.v4.runtime.Recognizer
import org.opency.pseudocode.grammar.pseudocodeLexer
import org.opency.pseudocode.grammar.pseudocodeParser

class ReplErrorListener : BaseErrorListener() {
    var hasError = false

    override fun syntaxError(
        recognizer: Recognizer<*, *>?,
        offendingSymbol: Any?,
        line: Int,
        charPositionInLine: Int,
        msg: String?,
        e: RecognitionException?
    ) {
        hasError = true
        println("  Error at position $charPositionInLine: $msg")
    }
}

class Repl {
    private val interpreter = Interpreter()
    private val history = mutableListOf<String>()
    private var multilineBuffer = StringBuilder()
    private var inMultilineMode = false
    private var bracketDepth = 0

    fun start() {
        printWelcome()

        while (true) {
            val prompt = if (inMultilineMode) "... " else ">>> "
            print(prompt)

            val line = readlnOrNull() ?: break
//            val line = readLine() ?: break

            // Handle special commands
            when {
                line.trim() == ":quit" || line.trim() == ":q" -> {
                    println("Goodbye!")
                    break
                }
                line.trim() == ":help" || line.trim() == ":h" -> {
                    printHelp()
                    continue
                }
                line.trim() == ":clear" || line.trim() == ":c" -> {
                    clearScreen()
                    continue
                }
                line.trim() == ":history" -> {
                    printHistory()
                    continue
                }
                line.trim() == ":reset" -> {
                    reset()
                    continue
                }
                line.trim().isEmpty() && !inMultilineMode -> {
                    continue
                }
            }

            // Add to history
            if (line.trim().isNotEmpty() && !line.trim().startsWith(":")) {
                history.add(line)
            }

            // Handle multiline input
            if (inMultilineMode) {
                multilineBuffer.append(line).append("\n")

                // Update bracket depth
                bracketDepth += line.count { it == '(' || it == '[' || it == '{' }
                bracketDepth -= line.count { it == ')' || it == ']' || it == '}' }

                // Check if we should exit multiline mode
                val trimmed = line.trim()
                if ((trimmed.startsWith("end ") || trimmed == "end") && bracketDepth <= 0) {
                    inMultilineMode = false
                    val code = multilineBuffer.toString()
                    multilineBuffer.clear()
                    bracketDepth = 0
                    executeCode(code)
                }
            } else {
                // Check if this starts a multiline statement
                val trimmed = line.trim()
                if (shouldStartMultiline(trimmed)) {
                    inMultilineMode = true
                    multilineBuffer.append(line).append("\n")
                    bracketDepth = line.count { it == '(' || it == '[' || it == '{' }
                    bracketDepth -= line.count { it == ')' || it == ']' || it == '}' }
                } else {
                    // Single line - execute immediately
                    executeCode(line)
                }
            }
        }
    }

    private fun shouldStartMultiline(line: String): Boolean {
        return line.startsWith("Algorithm ") ||
                line.startsWith("Procedure ") ||
                line.startsWith("if ") ||
                line.startsWith("while ") ||
                line.startsWith("for ") ||
                line.startsWith("repeat")
    }

    private fun executeCode(code: String) {
        try {
            // Wrap single expressions/statements in a temporary algorithm if needed
            val fullCode = if (!code.trim().startsWith("Algorithm") &&
                !code.trim().startsWith("Procedure")) {
                wrapInAlgorithm(code)
            } else {
                code
            }

            val input = CharStreams.fromString(fullCode)
            val lexer = pseudocodeLexer(input)

            val errorListener = ReplErrorListener()
            lexer.removeErrorListeners()
            lexer.addErrorListener(errorListener)

            val tokens = CommonTokenStream(lexer)
            val parser = pseudocodeParser(tokens)
            parser.removeErrorListeners()
            parser.addErrorListener(errorListener)

            val tree = parser.program()

            if (errorListener.hasError) {
                return
            }

            // For wrapped code, we need special handling
            if (!code.trim().startsWith("Algorithm") &&
                !code.trim().startsWith("Procedure")) {
                executeWrappedCode(tree)
            } else {
                // Regular algorithm/procedure definition
                interpreter.visit(tree)
            }

        } catch (e: Interpreter.ReturnException) {
            // Return in REPL just shows the value
            if (e.value !is Value.Null) {
                println(e.value)
            }
        } catch (e: RuntimeException) {
            println("Error: ${e.message}")
        } catch (e: Exception) {
            println("Error: ${e.message}")
        }
    }

    private fun wrapInAlgorithm(code: String): String {
        // Check if it's just an expression (no assignment, no control flow)
        val trimmed = code.trim()
        val isExpression = !trimmed.contains("<-") &&
                !trimmed.contains("←")  // This may need to be modified to contain both '←' and '<-'
                !trimmed.startsWith("if ") &&
                !trimmed.startsWith("while ") &&
                !trimmed.startsWith("for ") &&
                !trimmed.startsWith("repeat") &&
                !trimmed.startsWith("return")

        return if (isExpression) {
            // Wrap in return so we can see the value
            """
            Algorithm __repl_temp__()
                return $code
            end Algorithm
            """.trimIndent()
        } else {
            """
            Algorithm __repl_temp__()
                $code
            end Algorithm
            """.trimIndent()
        }
    }

    private fun executeWrappedCode(tree: pseudocodeParser.ProgramContext) {
        // Visit the tree to define the function
        interpreter.visit(tree)

        // Now call the temporary function
        val tempFunc = interpreter.globalEnv.get("__repl_temp__") as? Value.Function
        if (tempFunc != null) {
            val result = interpreter.callFunction(tempFunc, emptyList())
            if (result !is Value.Null) {
                println(result)
            }
        }
    }

    private fun reset() {
        interpreter.reset()
        println("Environment reset")
    }

    private fun printWelcome() {
        println("""
            ╔═══════════════════════════════════════════════════════╗
            ║     PseudoCode Interactive REPL v1.0.0                ║
            ║     Type :help for commands, :quit to exit            ║
            ╚═══════════════════════════════════════════════════════╝
        """.trimIndent())
        println()
    }

    private fun printHelp() {
        println("""
            REPL Commands:
              :help, :h       - Show this help message
              :quit, :q       - Exit the REPL
              :clear, :c      - Clear the screen
              :history        - Show command history
              :reset          - Reset the environment (clear all variables)
            
            Quick Tips:
              - Enter expressions directly: 5 + 3
              - Define variables: x <- 42
              - Define functions using Algorithm/Procedure (multiline)
              - Arrays are 1-indexed: [1, 2, 3][1] = 1
              - Use {} for objects: obj <- {name: "Alice", age: 25}
              - Use {} for sets: A <- {1, 2, 3}
            
            Examples:
              >>> 5 + 3
              8
              
              >>> x <- 42
              >>> x * 2
              84
              
              >>> arr <- [10, 20, 30]
              >>> arr[1]
              10
              
              >>> Algorithm double(n)
              ...     return n * 2
              ... end Algorithm
              >>> double(5)
              10
        """.trimIndent())
    }

    private fun printHistory() {
        if (history.isEmpty()) {
            println("No history")
            return
        }

        println("Command History:")
        history.forEachIndexed { index, cmd ->
            println("  ${index + 1}: $cmd")
        }
    }

    private fun clearScreen() {
        // ANSI escape code to clear screen
        print("\u001b[H\u001b[2J")
        System.out.flush()
        printWelcome()
    }
}

// Extension to make callFunction accessible
//fun Interpreter.callFunctionPublic(func: Value.Function, args: List<Value>): Value {
    // We need to expose the callFunction method
    // This is a workaround - ideally we'd make it internal or public
//    return this.callFunction(func, args)
//}
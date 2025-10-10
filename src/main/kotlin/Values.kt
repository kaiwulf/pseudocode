import org.opency.pseudocode.grammar.pseudocodeParser

sealed class Value {
    data class Number(val value: Double) : Value()
    data class String(val value: kotlin.String) : Value()
    data class Boolean(val value: kotlin.Boolean) : Value()
    data class Array(val elements: MutableList<Value>) : Value() {
        // 1-based indexing: internal list is 0-based, but we add/subtract 1
        fun get(index: Int): Value {
            if (index < 1 || index > elements.size) {
                throw RuntimeException("Array index out of bounds: $index")
            }
            return elements[index - 1]
        }

        fun set(index: Int, value: Value) {
            if (index < 1 || index > elements.size) {
                throw RuntimeException("Array index out of bounds: $index")
            }
            elements[index - 1] = value
        }

        fun length(): Int = elements.size
    }
    data class Set(val elements: MutableSet<Value>) : Value()
    data object Null : Value()
    data object Infinity : Value()
    data object EmptySet : Value()

    data class BuiltinFunction(val name: kotlin.String, val arity: Int, val function: (List<Value>) -> Value) : Value()

    data class Function(
        val params: List<kotlin.String>,
        val body: pseudocodeParser.BlockContext,
        val closure: Environment
    ) : Value()

    // Helper to convert to Kotlin types
    fun toKotlinDouble(): Double = when (this) {
        is Number -> value
        Infinity -> Double.POSITIVE_INFINITY
        else -> throw RuntimeException("Cannot convert $this to number")
    }

    fun toKotlinBoolean(): kotlin.Boolean = when (this) {
        is Boolean -> value
        else -> throw RuntimeException("Cannot convert $this to boolean")
    }
}
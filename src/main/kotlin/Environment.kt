class Environment(private val parent: Environment? = null) {
    private val values = mutableMapOf<String, Value>()

    fun define(name: String, value: Value) {
        values[name] = value
    }

    fun get(name: String): Value {
        return values[name] ?: parent?.get(name)
        ?: throw RuntimeException("Undefined variable: $name")
    }

    fun set(name: String, value: Value) {
        if (values.containsKey(name)) {
            values[name] = value
        } else if (parent != null) {
            parent.set(name, value)
        } else {
            // In pseudocode, assignment creates variables
            values[name] = value
        }
    }

    fun createChild(): Environment = Environment(this)

    fun printAll() {
        for ((key, value) in values) {
            println("key: $key   value: $value")
        }
    }
}
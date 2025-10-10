import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
//import org.opency.pseudocode.grammar.pseudocodeLexer
//import org.opency.pseudocode.grammar.pseudocodeParser
//
//import org.antlr.v4.runtime.CharStreams
//import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.BaseErrorListener
import org.antlr.v4.runtime.RecognitionException
import org.antlr.v4.runtime.Recognizer
import org.opency.pseudocode.grammar.pseudocodeLexer
import org.opency.pseudocode.grammar.pseudocodeParser
import java.io.File

class ErrorListener : BaseErrorListener() {
    override fun syntaxError(
        recognizer: Recognizer<*, *>?,
        offendingSymbol: Any?,
        line: Int,
        charPositionInLine: Int,
        msg: String?,
        e: RecognitionException?
    ) {
        println("Syntax error at line $line:$charPositionInLine - $msg")
    }
}

fun main(args: Array<String>) {
    // Check for REPL mode
    if (args.isEmpty() || args[0] == "--repl" || args[0] == "-i") {
        Repl().start()
        return
    }

    // Check for help
    if (args[0] == "--help" || args[0] == "-h") {
        printUsage()
        return
    }

    // Check for version
    if (args[0] == "--version" || args[0] == "-v") {
        println("PseudoCode Interpreter v1.0.0")
        return
    }

    // File execution mode
    val filename = args[0]
    val file = File(filename)

    if (!file.exists()) {
        println("Error: File '$filename' not found")
        return
    }

    try {
        val input = CharStreams.fromFileName(filename)
        val lexer = pseudocodeLexer(input)
        lexer.removeErrorListeners()
        lexer.addErrorListener(ErrorListener())

        val tokens = CommonTokenStream(lexer)
        val parser = pseudocodeParser(tokens)
        parser.removeErrorListeners()
        parser.addErrorListener(ErrorListener())

        val tree = parser.program()

        val interpreter = Interpreter()
        interpreter.visit(tree)
        interpreter.runFunction("main", emptyList())
    } catch (e: RuntimeException) {
        println("Runtime error: ${e.message}")
        if (args.contains("--debug")) {
            e.printStackTrace()
        }
    } catch (e: Exception) {
        println("Error: ${e.message}")
        if (args.contains("--debug")) {
            e.printStackTrace()
        }
    }
}

fun printUsage() {
    println("""
        PseudoCode Interpreter v1.0.0
        
        Usage:
          pseudocode [options] [file]
          
        Options:
          --repl, -i           Start interactive REPL mode
          --help, -h           Show this help message
          --version, -v        Show version information
          --debug              Show debug information on errors
          
        Examples:
          pseudocode                      Start REPL
          pseudocode program.psc          Execute a file
          pseudocode --repl               Start REPL explicitly
          pseudocode --debug program.psc  Execute with debug info
          
        REPL Commands (once in REPL):
          :help, :h            Show REPL help
          :quit, :q            Exit REPL
          :clear, :c           Clear screen
          :history             Show command history
          :reset               Reset environment
    """.trimIndent())
}
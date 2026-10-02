// Task 4.7: finding the longest line in a file
import kotlin.io.path.Path
import kotlin.io.path.exists
import kotlin.io.path.forEachLine

fun main(args: Array<String>) {
    // 1. 检查命令行参数
    if (args.isEmpty()) {
        println("Error: Please provide a file path as a command line argument.")
        return
    }
    var currentLineNumber = 0
    var longestLineNumber = 0
    var maxLength = -1

    filePath.forEachLine { line ->
        currentLineNumber++
        if (line.length > maxLength) {
            maxLength = line.length
            longestLineNumber = currentLineNumber
        }
    }
    if (currentLineNumber > 0) {
        println("Line $longestLineNumber is the longest (length = $maxLength)")
    } else {
        println("File is empty.")
    }
}
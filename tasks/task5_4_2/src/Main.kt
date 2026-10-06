// Task 5.4.1: main program

fun main() {
    val shortString = "Hello, Kotlin!"
    val longString = "This is a very long string that has more than twenty characters."

    // Call the extension function directly on String instances
    println("Is shortString too long? ${shortString.isTooLong}") // Output: false
    println("Is longString too long? ${longString.isTooLong}")   // Output: true
}
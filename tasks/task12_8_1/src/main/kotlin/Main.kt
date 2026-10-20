// Task 12.8.1: demo program for Day enum class
fun main() {
    print("Enter a day: ")
    val input = readln()
    try {
        val day = Day.valueOf(input)
        println("You chose $day")
    } catch (e: IllegalArgumentException) {
        println("'$input' is not a valid day.")
        println("Please enter one of: ${Day.entries.joinToString()}")
    }
}
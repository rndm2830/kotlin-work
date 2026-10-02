// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: Please provide exactly three numerical marks as command line arguments.")
        return
    }

    val mark1 = args[0].toDoubleOrNull()
    val mark2 = args[1].toDoubleOrNull()
    val mark3 = args[2].toDoubleOrNull()

    if (mark1 == null || mark2 == null || mark3 == null) {
        println("Error: All inputs must be valid numbers.")
        return
    }

    val average = (mark1 + mark2 + mark3) / 3.0
    val roundedAverage = average.roundToInt()

    val grade = when (roundedAverage) {
        in 0..39 -> "Fail"
        in 40..69 -> "Pass"
        in 70..100 -> "Distinction"
        else -> "Invalid Mark"
    }

    println("Average mark: $roundedAverage")
    println("Grade: $grade")
}
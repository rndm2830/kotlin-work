// Task 5.3.2: rollDice() function
import kotlin.plus
import kotlin.random.Random
fun rollDice(sides:Int = 6, diceNumber: Int = 1){
    val validSides = setOf(4, 6, 8, 10, 12, 20)
    if (sides !in validSides) {
        println("Error: cannot have a $sides-sided die")
        return
    }

    if (diceNumber < 1) {
        println("Error: must roll at least 1 die")
        return
    }

    println("Rolling $diceNumber d$sides...")
    var total = 0
    for (i in 1..diceNumber) {
        val result = Random.nextInt(1, sides + 1)
        println("  Die $i: $result")
        total += result
    }
    println("Total: $total")
}
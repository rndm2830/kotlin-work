// Task 5.1.2: main program
fun main(args: Array<String>) {
    if (args.isEmpty()) {
        rollDie()
        return
    }

    val sides = args[0].toIntOrNull()

    if (sides == null) {
        println("Error: \"${args[0]}\" is not a valid number")
        return
    }

    rollDie(sides)
}
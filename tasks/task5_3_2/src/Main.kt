// Task 5.3.2: main program
fun main(args: Array<String>) {
    // 1. 用不同方式调用 rollDice()，观察默认值和命名参数
    println("=== 演示各种调用方式 ===")
    rollDice()                              // 默认：1 个 d6
    rollDice(20)                            // 1 个 d20
    rollDice(diceNumber = 3)                     // 3 个 d6（命名参数）
    rollDice(8, 2)                          // 2 个 d8（位置参数）
    rollDice(diceNumber = 4, sides = 10)         // 4 个 d10（命名参数，顺序打乱）
    rollDice(sides = 12, diceNumber = 2)         // 2 个 d12

    // 2. 从命令行解析骰子规格
    if (args.isEmpty()) {
        println("\nUsage: please provide a dice specification (e.g. 3d8)")
        return
    }

    val spec = args[0]
    val countStr = spec.substringBefore("d")
    val sidesStr = spec.substringAfter("d")

    val count = countStr.toIntOrNull()
    val sides = sidesStr.toIntOrNull()

    if (count == null || sides == null) {
        println("Error: invalid dice specification \"$spec\"")
        return
    }

    println("\n=== 按命令行规格掷骰 ===")
    rollDice(sides, count)
}
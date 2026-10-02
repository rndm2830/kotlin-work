// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // 1. 校验命令行参数
    if (args.isEmpty()) {
        println("Error: Please provide an upper limit as a command line argument.")
        return
    }

    val limit = args[0].toIntOrNull()
    if (limit == null || limit < 1) {
        println("Error: Please provide a valid positive integer limit.")
        return
    }

    // 2. 累加变量声明为 Long，防止数值溢出
    var sum: Long = 0L

    // 3. 使用 for 循环结合 step 2 遍历 1 到 limit 之间的所有奇数
    for (n in 1..limit step 2) {
        sum += n
    }

    // 4. 打印结果
    println("Sum of odd integers from 1 to $limit is: $sum")
}
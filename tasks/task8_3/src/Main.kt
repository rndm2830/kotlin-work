// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.isEmpty()) {
        println("Please provide a filename.")
        return
    }
    val filename = args[0]
    val dataset = fetchData(filename) // 加载数据集

    val lowest = dataset.minBy { it.second }
    val highest = dataset.maxBy { it.second } // 修正：用 maxBy 找最高温度

    println("Lowest: ${lowest.first} = ${lowest.second}")
    println("Highest: ${highest.first} = ${highest.second}")

    // 一行代码计算平均温度并保留两位小数输出
    val avg = dataset.map { it.second }.average()
    println("Average: %.2f".format(avg))
}

// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here
    if (args.isEmpty()) {
        println("Error: No filename provided.")
        exitProcess(1)
    }

    val filename = args[0]

    // 使用 try-catch 或 runCatching 拦截异常
    val result = runCatching {
        val data = readData(filename)
        val varVal = variance(data)
        Pair(data.size, varVal)
    }

    if (result.isSuccess) {
        val (size, variance) = result.getOrThrow()
        println("Dataset size: $size")
        // 将方差格式化为五位小数
        println("Variance: %.5f".format(variance))
    } else {
        // 捕获异常并打印信息，然后以非零状态码终止
        val exception = result.exceptionOrNull()
        println("Error: ${exception?.message ?: "Unknown error"}")
        exitProcess(1)
    }
}

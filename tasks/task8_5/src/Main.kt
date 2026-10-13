// Task 8.5: example of using a higher-order function

fun main() {
    // Add your testing code here
    val text = "Hello Kotlin World!"

    // 1. 统计元音字母的个数（使用 Lambda）
    val vowelCount = text.howMany { it.lowercase() in "aeiou" }
    println("元音字母数: $vowelCount")

    // 2. 统计大写字母的个数
    val uppercaseCount = text.howMany { it.isUpperCase() }
    println("大写字母数: $uppercaseCount")

    // 3. 统计空格的个数
    val spaceCount = text.howMany { it == ' ' }
    println("空格数: $spaceCount")

    // 对比：也可以尝试使用 Kotlin 自带的内置 count() 函数传入相同的 Lambda 验证结果是否一致
    val builtinCount = text.count { it.isUpperCase() }
    println("内置 count 验证大写字母数: $builtinCount")
}

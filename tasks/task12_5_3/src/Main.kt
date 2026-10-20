// Task 12.5.3: demo program for class with custom setter
import kotlinx.datetime.LocalDate

fun main() {
    val p = Person("", LocalDate(1992, 8, 23))
    println("初始名字: ${p.name}")

//    // 正常赋值
//    p.name = "David"
//    println("改名后: ${p.name}")

    // 尝试赋空字符串，应该抛异常
    p.name = " "
    println("这行不会执行")
}
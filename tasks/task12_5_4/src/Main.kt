// Task 12.5.4: demo program for class with a computed property
import kotlinx.datetime.LocalDate

fun main() {
    val p = Person("Joe", LocalDate(1992, 8, 23))
    println("${p.name} 的年龄: ${p.age}")
}
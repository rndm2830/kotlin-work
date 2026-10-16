// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate

fun main() {
    // 此时可以直接用字符串形式传入出生日期[cite: 5]
    val person = Person("Alice", "1997-08-23")
    val p = Person("   ", LocalDate(1997, 8, 23))

    println("Name: ${person.name}")
    println("Birth: ${person.birth}")
    println("Is Married: ${person.isMarried}")

    println("Name: ${p.name}")
    println("Birth: ${p.birth}")
    println("Is Married: ${p.isMarried}")
}
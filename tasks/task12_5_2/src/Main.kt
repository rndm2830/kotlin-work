// Task 12.5.2: demo program for class with custom getter
import kotlinx.datetime.LocalDate

fun main() {
    val p = Person("JoE", LocalDate(1992, 8, 23))
    println(p.name)

    p.name = "aLiCe"       // setter 是默认的，原样存储 "aLiCe"
    println(p.name)        // ALICE（getter 又转成大写）
}
// Task 4.2: use of if and ranges

fun main() {
    println("PIZZA MENU\n")
    println("(a) Margherita")
    println("(b) Quattro Stagioni")
    println("(c) Seafood")
    println("(d) Hawaiian\n")

    print("Choose your pizza (a-d): ")
    val input = readln().lowercase()

    // 校验长度为 1 且首字符在字符区间 'a'..'d' 内
    val message = if (input.length == 1 && input[0] in 'a'..'d') {
        "Order accepted"
    } else {
        "Invalid choice!"
    }

    println(message)
}

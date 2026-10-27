// Task 15.2.3: demo program

fun main() {
    // Write code to demonstrate the classes here
    val savings = SavingsAccount("Alice", 1.8)

    // 存入 £1,250
    savings.deposit(1250)
    println("Initial balance: £${savings.balance}")

    // 连续计息 5 年（调用 5 次 applyInterest）
    repeat(5) {
        savings.applyInterest()
    }
    println("After 5 years of interest: £${savings.balance}")

    // 取出 £50
    savings.withdraw(50)
    println("After withdrawing £50: £${savings.balance}")
}

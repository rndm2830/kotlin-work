// Task 15.2.3: SavingsAccount class
class SavingsAccount(holder: String, val rate: Double) : BankAccount(holder) {
    init {
        require(rate > 0.0) { "Interest rate must be greater than 0" }
    }

    fun applyInterest() {
        // 根据当前 balance 和 rate 计算利息并存入账户
        val interest = (balance * (rate / 100.0)).toInt()
        deposit(interest)
    }
}
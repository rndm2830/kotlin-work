package comp2850.banking
class StudentAccount(holder: String) : BankAccount(holder) {
    var overdraft: Int = 0
        set(value) {
            require(value in 0..100) {"Overdraft outside the range 0 to 100!"}
            field = value
        }

    override fun toString(): String {
        return "Account for $holder, balance = $balance (overdraft = $overdraft)"
    }

    override fun withdraw(amount: Int) {
        require(amount > 0) {"Withdrawal amount must be greater than 0"}
        require(balance - amount >= -overdraft) {"Insufficient funds for withdrawal"}
        balance -= amount
    }

    fun withdrawalsAllowed(): Boolean {
        return balance > -overdraft
    }
}

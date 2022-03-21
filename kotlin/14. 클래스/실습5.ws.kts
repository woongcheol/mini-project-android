// Class 자료형(타입)
class Bank {

    fun save(account: Account, money: Int) {
        if (money >= 0) account.balance += money
        else println("마이너스 금액은 예금할 수 없습니다.")
    }

    fun withdraw(account: Account, money: Int) {
        if (account.checkBalance() >= money) account.balance -= money
        else println("잔액이 부족합니다.")
    }
}

class Account constructor(
    val initialBalance: Int = 0
) {
    var balance: Int = 0

    init {
        this.balance = initialBalance
    }

    fun checkBalance(): Int {
        return this.balance
    }
}

val account = Account(1000)
val bank = Bank()
bank.save(account, 1000)
println(account.checkBalance())
bank.withdraw(account, 2000)
println(account.checkBalance())
// overriding
open class Warrior() {
    open fun attack() {
        println("공격")
    }
}

class DefenseWarrior() : Warrior() {
    override fun attack() {
        println("일반 공격")
    }

    fun defense() {
        println("일반 방어")
    }
}

var defenseWarrior = DefenseWarrior()
defenseWarrior.defense()
defenseWarrior.attack()

// overloading
class Sum() {
    fun sum(): Int {
        return 10
    }

    fun sum(number1: Int): Int {
        return number1 + 10
    }

    fun sum(number1: Int, number2: Int): Int {
        return number1 + number2
    }
}

val sum = Sum()
println(sum.sum())
println(sum.sum(1))
println(sum.sum(1, 2))
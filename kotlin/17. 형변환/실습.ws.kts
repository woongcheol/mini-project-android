// Tyoe Casting
val number: Int = 1
val numberString: String = number.toString()
val numberInt: Int = number.toInt()
println(number)
println(numberString)
println(numberInt)

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

// is
val warrior: Warrior = DefenseWarrior()

if (warrior is DefenseWarrior) {
    warrior.defense()
    warrior.attack()
}

val warrior2: DefenseWarrior = warrior as DefenseWarrior
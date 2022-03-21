// Inheritance
open class Warrior() {
    fun attack() {
        println("공격")
    }
}

class DefenseWarrior() : Warrior() {
    fun defense() {
        println("방어")
    }
}

val defensewarrior1: DefenseWarrior = DefenseWarrior()
defensewarrior1.defense()
defensewarrior1.attack()
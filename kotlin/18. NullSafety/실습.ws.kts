// ?, !!, ?., as?, ?:
val number: Int = 10
val number: Int? = null

val nullableNumberList: List<Int?> = listOf(1, 2, 3)
var result: Int = 0
nullableNumberList.forEach{
    result += it!!
}

val text: String? = null
println(text?.length)

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

val warrior = Warrior()
val defenseWarrior = warrior as? DefenseWarrior
defenseWarrior

val text2: String = "123"
val nullText: String = null

val len1: Int = if (text2 != null) text2.length else 0
val len2: Int = text2?.length ?: 0
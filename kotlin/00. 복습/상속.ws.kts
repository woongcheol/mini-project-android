// 게임 만들기

open class DefaultAbility constructor(power: Int, def: Int, hp: Int) {
    var level: Int = 1
    var power: Int
    var def: Int
    var hp: Int
    open var exp: Int = 0
    var life: Boolean = true

    init {
        this.power = power
        this.def = def
        this.hp = hp
    }

    open fun attack(target: DefaultAbility) {
        if (target.life == false) {
            return println("상대는 죽어있습니다.")
        }

        println("${this}가 공격했습니다.")
        target.hp -= this.power - target.def

        if (target.hp > 0) {
            println("${target}의 체력이 ${target.hp}가 남았습니다.")
        } else {
            println("${target}가 죽었습니다.")
            target.life = false
        }
    }

}

class Warrior(power: Int, def: Int, hp: Int) : DefaultAbility(power, def, hp) {
    override var exp: Int = 0

    override fun attack(target: DefaultAbility) {
        if (target.life) {
            super.attack(target)
            if (!target.life) {
                this.exp += target.exp
                println("경험치를 ${target.exp} 얻었습니다!")
            }
            if (exp >= 5) {
                this.level += 1
                println("레벨 ${this.level}로 레벨업 하였습니다.")
            }
        }

    }
}

class Monster(power: Int, def: Int, hp: Int) : DefaultAbility(power, def, hp) {
    override var exp: Int = 5
    override fun attack(target: DefaultAbility) {
        super.attack(target)
    }
}

val test2 = Warrior(30, 10, 100)
val test3 = Monster(30, 5, 100)
test2.attack(test3)
test3.attack(test2)
test2.attack(test3)
test2.attack(test3)
test2.attack(test3)
test2.attack(test3)
test3.attack(test2)
test3.attack(test2)
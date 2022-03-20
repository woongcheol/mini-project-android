class FootballPlayer constructor(uniform: String, ball: String) {

    val uniform: String
    val ball: String

    init {
        this.uniform = uniform
        this.ball = ball
    }

    fun kick() {
        println("공을 찼다.")
    }

    fun pass() {
        println("패스하다.")
    }
}

val player1 = FootballPlayer("빨강", "축구공")
println(player1.uniform)
player1.kick()
player1.pass()
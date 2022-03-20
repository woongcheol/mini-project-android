class Calculator1() {

    fun plus(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun sub(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    fun div(num1: Float, num2: Float): Float {
        return num1 / num2
    }

    fun multi(num1: Int, num2: Int): Int {
        return num1 * num2
    }
}

val cal = Calculator1()
println(cal.plus(1, 2))
println(cal.sub(1, 2))
println(cal.div(1f, 2f))
println(cal.multi(1, 2))
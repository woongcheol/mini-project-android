// Scope

var number: Int = 1

fun changeNumber() {
    var number: String = "재정의"
    println(number)
}

//changeNumber()
//println(number)

// 접근 제한자
class Numbers(private var number: Int = 10) {
    fun changeNumber() {
        this.number = 100
    }

    fun whatIsNumber(): Int {
        return this.number
    }
}

val numbers = Numbers()
println(numbers.whatIsNumber())
numbers.changeNumber()
println(numbers.whatIsNumber())
// if, else if, else - 첫 번째 방법
/*val number: Int = 10
if (number == 10) {
    println("same")
} else if (number != 10) {
    println("not same")
} else {
    println("all not")
}*/

// if, else if, else - 두 번째 방법
val number1: Int = 10
if (number1 == 10) println("same")
else if (number1 != 10) println("not same")
else print("not all")

val number2: Int = 30
val number3: Int = 50
val numberCheck: Boolean = if (number2 > number3) true else false
println(numberCheck)

//when
val number4: Int = 5
when (number4) {
    5 -> {
        println("5입니다.")
    }
    6 -> {
        println("6입니다.")
    }
    else -> {
        println("모르겠습니다.")
    }
}

when (number4) {
    in 1..10 -> {
        println("1~10에 있습니다.")
    }
    in 11..20 -> {
        println("11~20에 있습니다.")
    }
    in 21..30 -> {
        println("21~30에 있습니다.")
    }
}
val a: Int = 5
val b: Int = 10
val c: Boolean = if (a == b) true else false
println(c)

val num: Int = 10
val double_num: Int = num * 2
println(double_num)

fun gre(math: Int, english: Int, science: Int): Unit {
    val result = (math + english + science) / 3

//    if (gre >= 90) {
//        println("your gre A")
//    } else if (gre >= 80) {
//        println("your gre B")
//    } else if (gre >= 70) {
//        println("your gre C")
//    } else {
//        println("your gre F")
//    }

    when (result) {
        in 90..100 -> println("your gre A")
        in 80..89 -> println("your gre B")
        in 70..79 -> println("your gre C")
        else -> println("your gre F")
    }
}

gre(50, 30, 20)

fun sum(math: Int?, english: Int?): Int {
    if (math == null || english == null) {
        return 0
    } else {
        return math + english
    }
}

println(sum(50, null))
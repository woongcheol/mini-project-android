fun hello_world(a: Int, b: Int): Int {
    var c = a + b
    return c
}

println(hello_world(1, 2))

fun hello_world2(a: Int, b: Int): Unit {
    var c = a + b
    println(c)
}

println(hello_world2(1, 2))
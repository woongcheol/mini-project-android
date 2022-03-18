loop@ for (i in 1..10) {
    println(i)
    for (j in 1..10) {
        println(j)
        if (j == 2) break@loop
    }
}
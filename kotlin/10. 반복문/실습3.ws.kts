// break
for (i in 1..10) {
    println("i : " + i)
    for (j in 1..10) {
        if (j == 2) break
        else println("j : " + j)
    }
}

// continue


// return
fun returnFunction(): Unit {
    for (i in 1..10) {
        println("i : " + i)
        for (j in 1..10) {
            if (j == 2) return
            else println("j : " + j)
        }
    }
}
returnFunction()
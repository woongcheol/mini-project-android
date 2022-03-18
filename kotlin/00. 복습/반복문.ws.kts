println("첫 번째 문제")
val text = listOf<String>("안녕하세요")
for (word in text) {
    println(word)
}

println("두 번째 문제")
val number = 10
var result = 0
for (num in 1..number) {
    result += num
}
println(result)

var result2 = 0
println("세 번째 문제")
for (i in 1..100) {
    if (i % 7 == 0) {
        result2 += i
    }
}
println(result2)

println("네 번째 문제")
fun addTo100(data: Int) {
    var num = data
    if (num < 100) {
        while (num < 100) {
            println(++num)
        }
    } else return
}

addTo100(50)

println("다섯 번째 문제")
val examList = listOf<Int>(70, 71, 72, 77, 78, 79, 80, 82, 90, 99)
val ans = mutableListOf<Boolean>()
fun checkScore(examList: List<Int>) {
    for (score in examList) {
        if (score >= 80) {
            ans.add(true)
        } else {
            ans.add(false)
        }
    }
}

checkScore(examList)
println(ans)

println("여섯 번째 문제")
val ans2 = mutableSetOf<List<Int>>()
fun cubeGame(start: Int, end: Int) {
    for (i in start..end) {
        for (j in start..end) {
            if (i + j == 6) {
                var a = listOf<Int>(i, j)
                ans2.add(a)
            } else continue
        }
    }
    println(ans2)
}

cubeGame(1, 6)

println("일곱 번째 문제")
fun eatMeal(start: Int, end: Int) {
    var startNum = start
    do {
        println("밥을 먹었다.")
        startNum++
        if (startNum >= end) {
            println("배가 부르다")
        }
    } while (startNum < end)
}

eatMeal(2, 3)

println("여덟 번째 문제")
val groupOne = mutableListOf<String>("A", "B", "C", "D", "E")
val groupTwo = mutableListOf<String>("A", "B", "C")
fun joinGroup(one: List<String>, two: List<String>, idx: Int) {
    val result = mutableListOf<List<String>>()
    if (one.size >= idx && two.size >= idx) {
        groupOne.removeAt(idx)
        groupTwo.removeAt(idx)
        result.add(groupOne)
        result.add(groupTwo)
        println(result)
    } else {
        println(null)
    }
}

joinGroup(groupOne, groupTwo, 2)
val result3 = mutableListOf<Int>()
println("아홉 번째 문제")
fun abc(num: Int) {
    for (i in 1..9) {
        result3.add(num * i)
    }
    println(result3)
}
abc(3)

println("열 번째 문제")
val even = mutableListOf<Int>()
val odd = mutableListOf<Int>()
val numMap = mutableMapOf<String, Collection<Int>>("짝수" to even, "홀수" to odd)
val numList = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)
println(numList[0])
fun divNum(data: Collection<Int>) {
    for (i in 0..data.size-1) {
        if (numList[i] % 2 == 0) {
            even.add(numList[i])
            numMap["짝수"] = even
        } else {
            odd.add(numList[i])
            numMap["홀수"] = odd
        }
    }
    println(numMap)
}

divNum(numList)

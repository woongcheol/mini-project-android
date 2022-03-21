// Interface

interface Tiger {
    fun bite()
    fun boToBox()
}

class BackDoSanTiger : Tiger {
    override fun bite() {
        TODO("Not yet implemented")
    }

    override fun boToBox() {
        TODO("Not yet implemented")
    }
}

val tiger1: BackDoSanTiger = BackDoSanTiger()

interface Person {
    var dress: String
    fun eat()
    fun sleep()
}

class Student: Person{
    override var dress: String
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun eat() {
        TODO("Not yet implemented")
    }

    override fun sleep() {
        TODO("Not yet implemented")
    }
}


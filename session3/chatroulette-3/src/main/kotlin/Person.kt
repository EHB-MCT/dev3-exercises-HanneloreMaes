open class Person(open val name: String) {
    fun introduce(){
        println("Hi, my name is $name")
    }

    open fun talk(){
        println("How you doing?")
    }
}
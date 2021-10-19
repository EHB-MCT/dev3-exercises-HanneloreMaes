class Teacher(protected val name: String): ChatPartner  {
    override fun talk(){
        funFact()
    }

    override fun introduce() {
        println("Hello, my name is $name")
    }
    fun funFact(){
        println("Did you know that Kotlin was named after an island")
    }
}
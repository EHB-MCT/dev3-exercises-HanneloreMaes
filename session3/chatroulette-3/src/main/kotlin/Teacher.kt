class Teacher(override val name: String): Person(name)  {
    override fun talk(){
        funFact()
    }

    fun funFact(){
        println("Did you know that Kotlin was named after an island")
    }
}
class Comedian(protected val name: String): ChatPartner {
    override fun introduce() {
        println("Hello, my name is $name")
    }

    override fun talk(){
        tellJoke()
    }

    fun tellJoke(){
        println("Way toooooo early")
    }
}
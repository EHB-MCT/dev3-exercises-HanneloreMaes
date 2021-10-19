class Chatbot (val name: String): ChatPartner{
    override fun introduce() {
        println("Hello, my name is $name")
    }
    override fun talk() {
        println("Me $name")
    }
}
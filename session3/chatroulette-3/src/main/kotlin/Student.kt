class Student(protected val name: String):ChatPartner {
    override fun talk(){
        gossip()
    }

    override fun introduce() {
        println("Hello, my name is $name")
    }

    fun gossip(){
        println("No gossip yet")
    }
}
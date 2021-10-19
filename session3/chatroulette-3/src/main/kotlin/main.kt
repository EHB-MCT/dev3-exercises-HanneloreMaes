fun main(){
    val persons = arrayOf(Student("Sam"), Teacher("Bruno"), Comedian("Balloon"), Chatbot("Clippy"))

    val chatMatch = persons.random()

    chatMatch.introduce()
    chatMatch.talk()
}
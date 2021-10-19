fun main(){
//    println("Player 1, what's your name?")
//    val person1 = readLine()
//    val name1 = Person("$person1")
//
//    println("Player 2, what's your name?")
//    val person2 = readLine()
//    val name2 = Person("$person2")
//
//    val persons = arrayOf(name1.name, name2.name)

//    val pickPerson = persons.random()
//
//    println("Hi there my name is $pickPerson")


    // deel 2
//    val chatPartners = arrayOf(Student("Sam"), Teacher("Bruno"), Comedian("Balloon"))
//
//    val chatPartner = chatPartners.random()
//    chatPartner.introduce()
//    chatPartner.talk()


    //deel 3
    val persons = arrayOf(Student("Sam"), Teacher("Bruno"), Comedian("Balloon"), Chatbot)

    val chatMatch = persons.random()
    chatMatch.introduce()
    chatMatch.talk()
}
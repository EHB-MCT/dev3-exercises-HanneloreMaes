fun main(){
    val person1 = Person("Player1")
    val person2 = Person("Player2")

    val persons = arrayOf(person1.name, person2.name).random()
    println("Hello. My name is $persons")
}
fun main(){
    println("Welcome to the world of disney")
    println("But there is a problem. Somme of the characters are gone and we don't know where to find them")
    println("Can you help us to find the missing characters?")
    println("Enter yes or no")

    val playerInput = readLine()
    if (playerInput == "yes"){
        println("Yippie! Pack your bag and let's go!")
    }
    if (playerInput == "no"){
        println("How unfortunate! See you another time")
    }


}
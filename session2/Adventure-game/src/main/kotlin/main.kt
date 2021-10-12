fun main(){
    println("'Welcome to the world of disney'")
    println("'But there is a problem. Somme of the characters are gone and we don't know where to find them'")
    println("'Can you help us to find the missing characters?'")
    println("Enter yes or no")

    val playerInput = readLine()
    if (playerInput == "yes"){
        println("'Yippie! Pack your bag and let's go!'")
        challengeOne()
    }
    if (playerInput == "no"){
        println("'How unfortunate! See you another time'")
    }


}
fun challengeOne(){
    println("*After walking for a while*")
    println("'Did you hear that noise? Something is hiding behind that rock'")
    println("'Would you want to know which character is hiding behind the rock?'")
    println("Enter yes or no")

    val playerInput2 = readLine()
    if (playerInput2 != "yes"){
        println("'Maybe an other time'")
        println("'Let's keep going'")
        challengeTwo()
    }
    if(playerInput2 == "yes"){
        println("I live in the jungle")
        println("My father was killed")
        println("I am to be king of the jungle one day")
        println("I sing I can’t wait to be king")
        println("Who am I?")

        val riddle1 = setOf("Simba","simba","The Lion King Simba", "the lion king simba", "lion king simba")
        val playerInput3 = readLine()
        if (riddle1.contains(playerInput3)){
            challengeTwo()
        } else {
            gameOver()
        }
    }
}
fun challengeTwo(){
    answerSucces()
    println(" ")
    println("*After walking for a while*")
    println("'Do you also see the dices on the ground? Are you willing to play a game?'")
    println("Enter yes or no")
    val playerInput4 = readLine()

    if (playerInput4 == "yes"){
        println("'Let's play guess the number!'")
        rollDice()
    } else{
        println("'Maybe an other time'")
        println("'Let's keep going'")
    }


}

fun rollDice(){
    val options = arrayOf("1", "2", "3","4","5","6")
    val randomNumber = (0..5).random()
    val computerChoice = options[randomNumber]

    println ("Choose your number between 1 and 6")
    val playerChoice = readLine().toString()

    if (computerChoice == playerChoice) {
        println ("You choose" + " " + playerChoice)
        println("Computer chooses" + " " + computerChoice)
        answerSucces()
    } else if (computerChoice > playerChoice || computerChoice < playerChoice){
        println ("You choose" + " " + playerChoice)
        println("Computer chooses" + " " + computerChoice)
        gameOver()
    }
}

fun answerSucces(){
    println("'Yippie! You guessed correctly'")
    println("'Let's keep moving and find the others'")
}

fun gameOver(){
    println("'Oh no! You answered wrong.'")
    println("'I think we shut head back to the others.'")
    println("'But no worry. You will be lucky next time'")
    println(" ")
    main()
}
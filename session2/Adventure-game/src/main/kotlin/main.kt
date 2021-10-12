fun main(){
    println("*Computer*")
    println("'Welcome to the world of disney'")
    println("'But there is a problem. Somme of the characters are gone and we don't know where to find them'")
    println("'Can you help us to find the missing characters?'")
    println("Enter yes or no")

    val playerInput = readLine()
    if (playerInput == "yes"){
        println("*Computer*")
        println("'Yippie! Pack your bag and let's go!'")
        challengeOne()
    }
    if (playerInput == "no"){
        println("*Computer*")
        println("'How unfortunate! See you another time'")
    }
}

fun challengeOne(){
    println("*After walking for a while*")
    println("*Computer*")
    println("'Did you hear that noise? Something is hiding behind that rock'")
    println("'Would you want to know which character is hiding behind the rock?'")
    println("Enter yes or no")

    val playerInput2 = readLine()
    if (playerInput2 != "yes"){
        println("*Computer*")
        println("'Maybe an other time'")
        println("'Let's keep going'")
        challengeTwo()
    }
    if(playerInput2 == "yes"){
        println("*Voice*")
        println("I live in the jungle")
        println("My father was killed")
        println("I am to be king of the jungle one day")
        println("I sing I can’t wait to be king")
        println("Who am I?")

        val riddle1 = setOf("Simba","simba","The Lion King Simba", "the lion king simba", "lion king simba")
        val playerInput3 = readLine()
        if (riddle1.contains(playerInput3)){
            println("*Computer*")
            println("'Yeah! We found Simba'")
            println("*Turning to Simba*")
            println("'But Simba, how come you are here?'")
            println(" ")
            println("*Simba*")
            println("'The hyaena's were chasing me, so I hid myself behind the rock'")
            println(" ")
            println("*Computer*")
            println("'No worry Simba, the hyaena's are gone. You can head back to the others'")
            println(" ")
            println("*Simba*")
            println("'Thank you very much. I see you two soon'")
            println(" ")
            println("*Computer*")
            println("'We should keep going and find the others'")
            challengeTwo()
        } else {
            gameOver()
        }
    }
}

fun challengeTwo(){
    println(" ")
    println("*After walking for a while*")
    println("*Computer*")
    println("'Do you also see the dices on the ground? Are you willing to play a game?'")
    println("Enter yes or no")
    val playerInput4 = readLine()

    if (playerInput4 == "yes"){
        println("*Computer*")
        println("'Let's play guess the number!'")
        rollDice()
    } else{
        println("*Computer*")
        println("'Maybe an other time'")
        println("'Let's keep going'")
        weaponChoice()
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
        println("''")
        println("*Computer*")
        println("'Yeah! We found Micky Mouse'")
        println("*Turning to Micky Mouse*")
        println("'But Micky Mouse, how come you are here?'")
        println(" ")
        println("*Micky Mouse*")
        println("'I was bored and thought of playing a fun game, but I waited here for hours and nobody came.'")
        println("'Until you two came and played my game.'")
        println(" ")
        println("*Computer*")
        println("'How fun! Luckely our hero guessed the right number that you can return home'")
        println(" ")
        println("*Micky Mouse*")
        println("'Indeed, now I can return home. Thank you very much for playing my game.'")
        println(" ")
        println("*Computer*")
        println("'We should keep going and find the others'")
        println("'Let's keep moving and find the others'")

        weaponChoice()
    } else if (computerChoice > playerChoice || computerChoice < playerChoice){
        println ("You choose" + " " + playerChoice)
        println("Computer chooses" + " " + computerChoice)
        gameOver()
    }
}

fun weaponChoice(){

}

fun answerSucces(){
    println("*Computer*")
    println("'Yippie! You guessed correctly'")
}

fun gameOver(){
    println("*Computer*")
    println("'Oh no! You answered wrong.'")
    println("'I think we should head back to the others.'")
    println("'But no worry. You will be lucky next time'")
    println(" ")
    main()
}
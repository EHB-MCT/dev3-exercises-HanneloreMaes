fun main(){
    val options = arrayOf("rock", "paper", "scissors")
    val randomNumber = (0..2).random()                    //https://stackoverflow.com/questions/45685026/how-can-i-get-a-random-number-in-kotlin
                                                          // .. staat voor until
    val computerChoice = options[randomNumber]

    println ("Choose your element: rock - paper - scissors")
    val playerChoice = readLine()
    println ("You choose" + " " + playerChoice)

    println("Computer chooses" + " " + computerChoice)


    if (computerChoice == playerChoice) {
        print("It's a draw")
    }
    if (computerChoice == "rock" && playerChoice == "paper") {
        print("You won!")
    }
    if (computerChoice == "rock" && playerChoice == "scissors") {
        print("You loose")
    }
    if (computerChoice == "paper" && playerChoice == "scissors") {
        print("You won!")
    }
    if (computerChoice == "paper" && playerChoice == "rock") {
        print("You loose")
    }
    if (computerChoice == "scissors" && playerChoice == "rock") {
        print("You won!")
    }
    if (computerChoice == "scissors" && playerChoice == "paper") {
        print("You loose")
    }
}
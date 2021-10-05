fun main(){
    println ("Choose your element")
    val playerchoice = readLine()
    println ("You choose" + " " + playerchoice)



    val options = arrayOf("Rock", "Paper", "Scissors")
    val randomNumber = (0..2).random()                    //https://stackoverflow.com/questions/45685026/how-can-i-get-a-random-number-in-kotlin
                                                          // .. staat voor until
    println("Computer chooses" + " " + options[randomNumber])

}
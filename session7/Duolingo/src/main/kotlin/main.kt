fun main(){
    println("How many words do you like to practice?")
    val setTotalWords = readLine()!!
    println("Which language do you like to practice?")
    val setLanguage = readLine()!!


    val duolingo = Duolingo("$setTotalWords","$setLanguage")
    duolingo.play()
}
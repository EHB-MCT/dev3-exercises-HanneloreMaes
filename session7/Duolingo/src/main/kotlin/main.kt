import java.lang.Exception

val diffArray = arrayOf("difficulty", "Difficulty")
val choseWordsArray = arrayOf("chosing", "Chosing")

fun main(){
    println("How would you like to pick?")
    println("By 'difficulty' or 'chosing'")
    val readDifWord = readLine()
    if(readDifWord in choseWordsArray) {
        chosingFun()
    }
    if (readDifWord in diffArray) {
        easyDiffFun()
    } else {
        throw Exception("Een typfoutje kan gebeuren, maar niet hier. Start opnieuw")
    }

}

fun easyDiffFun(){
    println("Would like to have easy level or difficult level? easy - difficult")
    val easyDiff = readLine()
    if (easyDiff == "easy") {
        println("Which language do you like to practice? Engels - Duits")
        val setLang = readLine()
        if (setLang == "Engels" || setLang == "Duits") {
            val setWords = 3
            val duolingoEasy = Duolingo(setWords, setLang)
            duolingoEasy.easyPlay()
        } else {
            throw Exception("Kies verstandelijk volgende keer. Falen is geen optie")
        }
    }
    if (easyDiff == "difficult") {
        println("Which language do you like to practice? Engels - Duits")
        val setLang = readLine()
        if (setLang == "Engels" || setLang == "Duits") {
            val setWords = 6
            val duolingoDiff = Duolingo(setWords, setLang)
            duolingoDiff.diffPlay()
        } else {
            throw Exception("Kies verstandelijk volgende keer. Falen is geen optie")
        }
    }
}

fun chosingFun(){
    println("How many words do you like to practice?")
    val setTotalWords = readLine()!!.toInt()
    println("Which language do you like to practice? Engels - Duits")
    val setLanguage = readLine()
    if (setLanguage == "Engels" || setLanguage == "Duits") {
        val duolingo = Duolingo(setTotalWords, setLanguage)
        duolingo.play()
    } else {
        throw Exception("Ai een foutje. Hier wordt je niet afgestraft, maar toch moet je herstarten")
    }
}
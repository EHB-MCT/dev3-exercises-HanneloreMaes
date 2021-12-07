class Duolingo (val number: Int = 5, val language: String) {

        val words = mutableListOf<Word>(
            Word("Truck", "Vrachtwagen", "English"),
            Word("Mother", "Moeder", "English"),
            Word("Friendship", "Vriendschap", "English"),
            Word("Toy", "Speelgoed", "English"),
            Word("Voice", "Stem", "English"),
            Word("Woman", "Vrouw", "English"),
            Word("Defeat", "Verlies", "English"),
            Word("Win", "Win", "English"),
            Word("Mirror", "Spiegel", "English"),
            Word("Lover", "Geliefde", "English"),

            Word("Nett", "Lief", "Duits"),
            Word("Klug", "Slim", "Duits"),
            Word("Schmetterling", "Vlinder", "Duits"),
            Word("Krakenwagen", "Ziekenwagen", "Duits"),
            Word("Salat", "Salade", "Duits"),
            Word("Klugscheißer", "Betweter", "Duits"),
            Word("Meer", "Zee", "Duits"),
            Word("Kaffee", "Koffie", "Duits"),
            Word("Auf Wiedersehen", "Tot ziens", "Duits"),
            Word("Lederhosen", "Lederen broek", "Duits")
        )

    fun play(){
        val listLanguage = words.filter {
            it.language == language
        }
        val fiveWords = listLanguage.shuffled().take(number).toMutableSet()           // altijd in playfunctie anders krijg je dezelfde woorden,,, gebruik van .toMutableSet om te kunnen aanpassen

        while (fiveWords.isNotEmpty()){
            val selectedWord = fiveWords.random()

            println("What is the translation of ${selectedWord.original}")
            val userInput = readLine()
            if (userInput != selectedWord.translated){
                println("Je hebt een foutje gemaakt. Dit is de juiste antwoord")
                println(selectedWord.translated)
            }else{
                fiveWords.remove(selectedWord)
            }
            println("Woorden te gaan: ${fiveWords.count()}")
        }
        println("Je hebt alle woorden gehad. Kom volgende keer zeker terug!")
    }
}
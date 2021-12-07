class Duolingo (val number: Int = 5, val language: String) {
        val words = mutableListOf<Word>(
            English("Truck", "Vrachtwagen"),
            English("Mother", "Moeder"),
            English("Friendship", "Vriendschap"),
            English("Toy", "Speelgoed"),
            English("Voice", "Stem"),
            English("Woman", "Vrouw"),
            English("Defeat", "Verlies"),
            English("Win", "Win"),
            English("Mirror", "Spiegel"),
            English("Lover", "Geliefde"),

            German("Nett", "Lief"),
            German("Klug", "Slim"),
            German("Schmetterling", "Vlinder"),
            German("Krakenwagen", "Ziekenwagen"),
            German("Salat", "Salade"),
            German("Klugscheißer", "Betweter"),
            German("Meer", "Zee"),
            German("Kaffee", "Koffie"),
            German("Auf Wiedersehen", "Tot ziens"),
            German("Lederhosen", "Lederen broek")
        )

    fun easyPlay(){
        val listLanguage = words.filter {
            it.language == language
        }
        val totalWords = listLanguage.shuffled().take(3).toMutableSet()           // altijd in playfunctie anders krijg je dezelfde woorden,,, gebruik van .toMutableSet om te kunnen aanpassen

        while (totalWords.isNotEmpty()){
            val selectedWord = totalWords.random()

            println("What is the translation of ${selectedWord.original}")
            val userInput = readLine()
            if (userInput != selectedWord.translated){
                println("Je hebt een foutje gemaakt. Dit is de juiste antwoord")
                println(selectedWord.translated)
            }else{
                totalWords.remove(selectedWord)
            }
            println("Woorden te gaan: ${totalWords.count()}")
        }
        println("Je hebt alle woorden gehad. Kom volgende keer zeker terug!")
    }

    fun diffPlay(){
        val listLanguage = words.filter {
            it.language == language
        }
        val totalWords = listLanguage.shuffled().take(3).toMutableSet()           // altijd in playfunctie anders krijg je dezelfde woorden,,, gebruik van .toMutableSet om te kunnen aanpassen

        while (totalWords.isNotEmpty()){
            val selectedWord = totalWords.random()

            println("What is the translation of ${selectedWord.original}")
            val userInput = readLine()
            if (userInput != selectedWord.translated){
                println("Je hebt een foutje gemaakt. Dit is de juiste antwoord")
                println(selectedWord.translated)
            }else{
                totalWords.remove(selectedWord)
            }
            println("Woorden te gaan: ${totalWords.count()}")
        }
        println("Je hebt alle woorden gehad. Kom volgende keer zeker terug!")
    }

    fun play(){
        val listLanguage = words.filter {
            it.language == language
        }
        val totalWords = listLanguage.shuffled().take(number).toMutableSet()           // altijd in playfunctie anders krijg je dezelfde woorden,,, gebruik van .toMutableSet om te kunnen aanpassen

        while (totalWords.isNotEmpty()){
            val selectedWord = totalWords.random()

            println("What is the translation of ${selectedWord.original}")
            val userInput = readLine()
            if (userInput != selectedWord.translated){
                println("Je hebt een foutje gemaakt. Dit is de juiste antwoord")
                println(selectedWord.translated)
            }else{
                totalWords.remove(selectedWord)
            }
            println("Woorden te gaan: ${totalWords.count()}")
        }
        println("Je hebt alle woorden gehad. Kom volgende keer zeker terug!")
    }
}
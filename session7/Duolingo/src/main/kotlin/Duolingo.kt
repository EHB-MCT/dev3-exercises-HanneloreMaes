class Duolingo (val number: Int = 5, val language: String) {
        val words = mutableListOf<Word>(
            English("Truck", "Vrachtwagen", 1),
            English("Mother", "Moeder", 1),
            English("Friendship", "Vriendschap", 1),
            English("Toy", "Speelgoed", 1),
            English("Voice", "Stem", 1),
            English("Woman", "Vrouw", 1),
            English("Defeat", "Verlies",2),
            English("Win", "Win",2),
            English("Mirror", "Spiegel",2),
            English("Lover", "Geliefde",2),

            German("Nett", "Lief", 2),
            German("Klug", "Slim", 1),
            German("Schmetterling", "Vlinder",2),
            German("Krakenwagen", "Ziekenwagen", 1),
            German("Salat", "Salade", 1),
            German("Klugscheißer", "Betweter", 2),
            German("Meer", "Zee",1),
            German("Kaffee", "Koffie",1),
            German("Auf Wiedersehen", "Tot ziens",1),
            German("Lederhosen", "Lederen broek",1)
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
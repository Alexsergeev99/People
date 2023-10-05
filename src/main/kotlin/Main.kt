fun main() {
    val likes: Int = readln().toInt()
    val word: String = if (likes == 11 || likes % 10 != 1 ) "людям" else "человеку"
    println("Понравилось $likes $word")
}
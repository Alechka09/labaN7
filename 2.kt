//Найти палиндром слова
fun main() {
    println("Введите слово :")
    val slovo = readLine()?.trim()?.lowercase()

    if (slovo!= null){
    if (isPalindrome(slovo)) {
            println("Слово $slovo является палиндромом")
        } else {
            println("Слово $slovo не является палиндромом")
        }
    }
}
// Функция для проверки
fun isPalindrome(word: String): Boolean {
    return word == word.reversed()
}
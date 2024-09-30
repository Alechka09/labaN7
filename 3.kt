//Напишите функцию, которая принимает количество побед, ничейных
//игр и поражений и возвращает количество очков, которая набрала команда.
fun calculatePoints(wins: Int, draws: Int, losses: Int): Int {
    val pointsFromWins = wins * 3 // Победа(3 очка за победу)
    val pointsFromDraws = draws * 1 // Ничья(1 очко за ничью)
    val totalPoints = pointsFromWins + pointsFromDraws // Общее количество
    return totalPoints
}
fun main() {
    println("Введите количество побед: ")
    val w = readLine()?.toIntOrNull()?: 0
    println("Введите количество ничьих: ")
    val d = readLine()?.toIntOrNull() ?: 0
    println("Введите количество поражений: ")
    val l = readLine()?.toIntOrNull() ?: 0
    val totalPoints = calculatePoints(w, d, l) // Вычисление очков
    println("Команда набрала $totalPoints очков")
}

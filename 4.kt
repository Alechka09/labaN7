//Напишите программу, которая принимает на вход список чисел, и
//возвращает самое маленькое число из этого списка.
fun main() {
    val numbers = listOf(2, 11, 9, 23, 55, 3, 99)
    val minNumber = findMinimum(numbers)
    println("Самое маленькое число в списке: $minNumber")
}
// Функция для нахождения самого маленького числа
fun findMinimum(numbers: List<Int>): Int? {
    return numbers.minOrNull() // метод minOrNull для нахождения минимального элемента
}
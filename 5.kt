fun main() {
    val num1 = 9
    val num2 = 22
    val rez = areEqual(num1, num2)
    println("Числа равны: $rez")
}
fun areEqual(a: Int, b: Int): Boolean { // Функция для сравнения двух чисел
    return a == b // возвращаем true, если числа равны, иначе false
}
//Написать консольный калькулятор
fun main(){
    println("введите число: " )
    val firstNumber = readLine()?.toDoubleOrNull()
    val secondNumber = readLine()?.toDoubleOrNull()

    if(firstNumber!=null && secondNumber !=null){
        println(" введите операцию + , - , / , * ")
        val o = readLine().toString()[0]
        var rez: Double? = null

        when(o) {
            '+' -> {rez =firstNumber + secondNumber}
            '-' -> {rez =firstNumber - secondNumber}
            '/' -> {rez =firstNumber / secondNumber}
            '*' -> {rez =firstNumber * secondNumber}
            else -> {
                println("выберите операцию и введите ее")
            }
        }
        if (rez != null) {
            println("$firstNumber $o $secondNumber = $rez")}
    }
}




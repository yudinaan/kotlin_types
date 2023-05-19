import java.math.*

fun main(){
    val operations: Array<String> = arrayOf("Доступные операции:", "1- Сложение", "2- Вычитание","3- Умножение" ,"4- Деление ", "5- Возведение в степень","6- Вычисление коня", "")

    for (operation in operations){
        println(operation)
    }
    print("Введите код операции: ")
    val key1: String = readln()
    val key = key1.toInt()
    print("Введите первй аргумент: ")
    val x1 = readln()
    val x = x1.toDouble()
    print("Введите второй агумент: ")
    val y1 = readln()
    val y = y1.toDouble()

    val result = calculation(key)

    println(result(x,y))
}

fun calculation(key: Int): (Double, Double) -> Double{

    when(key){
        1 -> return {x: Double, y: Double -> x + y}
        2 -> return {x: Double, y: Double -> x - y}
        3 -> return {x: Double, y: Double -> x * y}
        4 -> return {x: Double, y: Double -> x / y}
       // 5 -> return {x: Double, y: Double -> x.pow(y)}
        else -> return {x: Double, y: Double -> x - x}
    }
}


fun first(){
    print("Введите значение с типом Int: ")
    val a: String? = readLine()
    try {
        val с: Int = a!!.toInt()
        println(с)
    }
    catch(e: Exception){
        println("Введено значение с другим типом")
    }
}


fun second(){
    print("Введите число для определения его типа: ")

    val input = readLine()
    val result: Any = when {
        input == null -> ""
        input.toIntOrNull() != null -> input.toInt()
        input.toDoubleOrNull() != null -> input.toDouble()
        else -> input
    }
    if (result is Int)
        println("Введено число типа Int")
    else if (result is Double)
        println("Введено число типа Double")
    else
        println("Введено не число")
}



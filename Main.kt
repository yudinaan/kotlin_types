
import kotlin.math.*

fun main(){
    val operations: Array<String> = arrayOf(
        "Доступные операции:",
        "1- Сложение",
        "2- Вычитание",
        "3- Умножение" ,
        "4- Деление ",
        "5- Возведение в степень",
        "6- Вычисление коня",
        "7- Вычисление факториала")

    for (operation in operations){
        println(operation)
    }

    print("Введите код операции: ")
    val key1: String = readln()
    val key = key1.toInt()
    val x = when(key){
        1, 2, 3, 4, 5, 6 -> inputx(key)
        else -> input0()
    }
    val y = when(key){
        1, 2, 3, 4, 5, 6 -> inputx(key)
        else -> input0()
    }
    val z = when(key){
        7 -> inputx(key)
        else -> input0()
    }

    val result = calculation(key)

    println(result(x,y,z))
}

fun inputx(key: Int): Double {
    print("Введите аргумент: ")
    val x1 = readln()
    val x = x1.toDouble()
    return x
}

fun input0(): Double{
    val x: Double = 0.0
    return x
}

fun factorial(z: Double): Double{
    if(z == 1.0){
        return z
    }
    else{
        val z1: Double = z * factorial(z-1)
        return z1
    }
}

fun calculation(key: Int): (Double, Double, Double) -> Double{

    when(key){
        1 -> return {x: Double, y: Double, z: Double -> x + y}
        2 -> return {x: Double, y: Double, z: Double -> x - y}
        3 -> return {x: Double, y: Double, z: Double -> x * y}
        4 -> return {x: Double, y: Double, z: Double -> x / y}
        5 -> return {x: Double, y: Double, z: Double -> x.pow(y)}
        6 -> return {x: Double, y: Double, z: Double -> x.pow(1/y)}
        7 -> return {x: Double, y: Double, z: Double -> factorial(z)}
        else -> return {x: Double, y: Double, z: Double -> x -x}
    }
}





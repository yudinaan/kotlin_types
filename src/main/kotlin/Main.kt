
fun first(){
    print("Введите значение с типом short: ")
    val a: String? = readLine()
    try {
        val с: Int = a!!.toInt()
        println(с)
    }
    catch(e: Exception){
        println("Введено значение с другим типом")
    }
}


fun main(args: Array<String>) {
    first()

}
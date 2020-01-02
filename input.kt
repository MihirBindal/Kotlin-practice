

fun main(args : Array<String>) {
    print("Enter text: ")
    val input = readLine()
    println("You entered: $input")

    print("Enter an Integer value: ")
    val string1 = readLine()!!
    val integerValue: Int = string1.toInt()
    println("You entered: $integerValue")

    print("Enter a double value: ")
    val string2= readLine()!!
    val doubleValue: Double = string2.toDouble()
    println("You entered: $doubleValue")
}

import java.util.Scanner;
fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    print("Enter any largebody:")
    var lb = reader.next()

    when(lb) {
        "Sun" -> println("Sun is a Star")
        "Moon" -> println("Moon is a Satellite")
        "Earth" -> println("Earth is a planet")
        else -> println("I don't know anything about it")
    }
    exp()
    check()
    check2()
    replace()
}
fun exp() {
    var reader = Scanner(System.`in`)
    print("Enter the month number:")
    var monthOfYear = reader.nextInt()
    var month = when(monthOfYear){
        1->"January"
        2->"Febuary"
        3->"March"
        4->"April"
        5->"May"
        6->"June"
        7->"July"
        8->"August"
        9->"September"
        10->"October"
        11->"November"
        12->"December"
        else -> {
            println("Not a month of year")
        }
    }
    println(month)
}
fun check() {
    var reader = Scanner(System.`in`)
    print("Enter the month number of year: ")
    var num = reader.nextInt()
    when(num){
        in 1..3 -> println("It is spring season")
        in 4..6 -> println("It is summer season")
        in 7..8 ->println("It is rainy season")
        in 9..10 -> println("It is autumn season")
        in 11..12 -> println("It is winter season")
        !in 1..12 ->println("Enter valid month of year")
    }
}
fun check2() {
    var num: Any = "CDGI"
    when(num){
        is Int -> println("It is an Integer")
        is String -> println("It is a String")
        is Double -> println("It is a Double")
    }
}
fun isOdd(x: Int) = x % 2 != 0
fun isEven(x: Int) = x % 2 == 0

fun replace() {
    var num = 8
    when{
        isOdd(num) ->println("Odd")
        isEven(num) -> println("Even")
        else -> println("Neither even nor odd")
    }
}

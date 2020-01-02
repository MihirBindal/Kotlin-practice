
fun main(args: Array<String>)
{
    for (i in 1..6) {
        print("$i ")
    }
    loop2()
    loop3()
    loop4()
}
fun loop2()
{
    for (i in 1..10 step 3) {
        print("$i ")
    }
}
fun loop3()
{
    for (i in 10 downTo 1 step 3) {
        print("$i ")
    }
}
fun loop4() {
    var name = "ABC"
    var name2 = "DEF"
    for (alphabet in name) print("$alphabet ")
    for (i in name2.indices) print(name2[i]+" ")
    println(" ")
    for ((index,value) in name.withIndex())
        println("Element at $index th index is $value")
}



fun main(args: Array<String>){
    val obj: Any = "The variable obj is automatically cast to a String in this scope"
    if(obj is String) {
        // No Explicit Casting needed.
        println("String length is ${obj.length}")
    }
    notis()
}
fun notis(){
    val obj: Any = "The variable obj is automatically cast to a String in this scope"
    if(obj !is String) {
        println("obj is not string")

    } else
    // No Explicit Casting needed.
        println("String length is ${obj.length}")
}
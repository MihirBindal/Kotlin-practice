fun main(args: Array<String>){

    val stringMap: HashMap<String,String> = hashMapOf<String,String>()
    stringMap.put("name", "Ashu")
    stringMap.put("city", "Delhi")
    stringMap.put("department", "Development")
    stringMap.put("hobby", "Playing")

    println("......traverse stringMap.......")
    for(key in stringMap.keys){
        println("Key = ${key} , value = ${stringMap[key]}")
    }

    println(".....stringMap.size........")
    println(stringMap.size)

    println(".......stringMap.keys......")
    println(stringMap.keys)
}
/*
fun main(args: Array<String>){

    val stringMap: HashMap<String,String> = hashMapOf<String,String>()
    stringMap.put("name", "Ashu")
    stringMap.put("city", "Delhi")
    stringMap.put("department", "Development")
    stringMap.put("hobby", "Playing")

    println("......traverse stringMap.......")
    for(key in stringMap.keys){
        println("Key = ${key} , value = ${stringMap[key]}")
    }

    println(".......stringMap.getValue(\"department\")......")
    println(stringMap.getValue("department"))

    println(".......stringMap.getOrDefault(\"name\", \"Default Value\")......")
    println(stringMap.getOrDefault("name", "Default Value"))
}

fun main(args: Array<String>){

    val stringMap: HashMap<String,String> = hashMapOf<String,String>()
    stringMap.put("name", "Ashu")
    stringMap.put("city", "Delhi")
    stringMap.put("department", "Development")
    stringMap.put("hobby", "Playing")

    println("......traverse stringMap.......")
    for(key in stringMap.keys){
        println("Key = ${key} , value = ${stringMap[key]}")
    }

    println("......stringMap.remove(\"city\").......")
    println(stringMap.remove("city"))
    println("......traverse stringMap after stringMap.remove(\"city\").......")
    for(key in stringMap.keys){
        println("Key = ${key} , value = ${stringMap[key]}")
    }
}

fun main(args: Array<String>){

    val stringMap: HashMap<String,String> = hashMapOf<String,String>()
    stringMap.put("name", "Ashu")
    stringMap.put("city", "Delhi")
    stringMap.put("department", "Development")
    stringMap.put("hobby", "Playing")

    println("......traverse stringMap.......")
    for(key in stringMap.keys){
        println("Key = ${key} , value = ${stringMap[key]}")
    }
    println(".......stringMap.remove(\"hobby\",\"Playing\")......")
    println(stringMap.remove("hobby","Playing"))
    println("......traverse stringMap after stringMap.remove(\"hobby\",\"Playing\").......")
    for(key in stringMap.keys){
        println("Key = ${key} , value = ${stringMap[key]}")
    }
}

fun main(args: Array<String>){

    val stringMap: HashMap<String,String> = hashMapOf<String,String>()
    stringMap.put("name", "Ashu")
    stringMap.put("city", "Delhi")
    stringMap.put("department", "Development")
    stringMap.put("hobby", "Playing")

    println("......traverse stringMap.......")
    for(key in stringMap.keys){
        println("Key = ${key} , value = ${stringMap[key]}")
    }

    stringMap.set("name","Ashutosh")
    stringMap.set("skill","Kotlin")
    println("......traverse stringMap after stringMap.set(\"name\",\"Ashutosh\") and   stringMap.set(\"skill\",\"Kotlin\").......")
    for(key in stringMap.keys){
        println("Key = ${key} , value = ${stringMap[key]}")
    }
}

fun main(args: Array<String>){

    val stringMap: HashMap<String,String> = hashMapOf<String,String>()
    stringMap.put("name", "Ashu")
    stringMap.put("city", "Delhi")
    stringMap.put("department", "Development")
    stringMap.put("hobby", "Playing")

    println("......traverse stringMap.......")
    for(key in stringMap.keys){
        println("Key = ${key} , value = ${stringMap[key]}")
    }

    println("......stringMap.clear().......")
    println(stringMap.clear())
    println(stringMap)

}
*/
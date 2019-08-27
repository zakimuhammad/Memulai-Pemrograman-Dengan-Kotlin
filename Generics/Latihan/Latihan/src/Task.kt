// Coming Soon
fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

    // TODO 2
    println(stringResult)
    println(intResult)
}

// TODO 1
fun <T> getResult(args: T): Int {
    when(args){
        is Int -> return args.toInt() * 5
        is String -> return args.toString().length
        else -> return 0
    }
}
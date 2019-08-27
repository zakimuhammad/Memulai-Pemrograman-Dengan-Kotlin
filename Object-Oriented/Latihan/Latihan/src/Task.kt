// TODO 1
class Cat(private val name: String) {
    var sleep: Boolean = false

    set(value){
        println("Fungsi setter dipanggil")
        field = value
    }
    get() {
        println("Fungsi getter dipanggil")
        return field
    }

    fun toSleep() {
        when(sleep){
            true -> println("$name, sleep!")
            false -> println("$name, let's play!")
        }
    }
}

fun main() {

    // TODO 2
    val gippy = Cat("Gippy")

    gippy.toSleep()
    gippy.sleep = true
    gippy.toSleep()
}
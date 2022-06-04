package one.dio.collections

fun main() {
    val names = Array(3){""}
    names[0] = "Maria"
    names[1] = "João"
    names[2] = "José"

    names.forEach { println(it) }

    //or

    val otherNames = arrayOf("Francisco", "Felipe", "Pedro")
    otherNames.sort()

    otherNames.forEach { println(it) }



}
package one.dio.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2
//    for (valor in values) {
//        println(valor)
//    }

//    values.forEach{
//        println(it)
//    }

    for (i in values.indices) {
        println(values[i])
    }

    values.sort()
    println("Sorted:")
    for (i in values.indices) {
        println(values[i])
    }
}
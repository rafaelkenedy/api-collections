package one.dio.collections

fun main() {
    val salary = arrayOf(
        "2000".toBigDecimal(),
        "2000".toBigDecimal(),
        "2000".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println("------------")
    println(salary.mySum())
    println("------------")
    println(salary.myAverage())
}
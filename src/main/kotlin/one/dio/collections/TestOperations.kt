package one.dio.collections

import kotlin.math.round

fun main() {
    val fees = doubleArrayOf(
        1200.0,
        2300.0,
        1850.0,
        2550.0,
        2560.0,
    )

    fees.forEach { println(round(it)) }
    println("High: ${fees.maxOrNull()}")
    println("Least: ${fees.minOrNull()}")
    println("Average: ${round(fees.average())}")

    val salaryBiggerThen2500 = fees.filter { it > 2500.0 }
    salaryBiggerThen2500.forEach { println(it) }

    println(fees.count { it in 2000.0..5000.0 })
    println(fees.find { it === 1850.0 })
    println(fees.any { it === 1850.0 })
    println(fees.any { it === 300.0 })
}
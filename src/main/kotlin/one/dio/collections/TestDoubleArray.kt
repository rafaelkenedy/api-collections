package one.dio.collections

import kotlin.math.round

fun main(){
    val fees = doubleArrayOf(
        1000.0,
        2000.0,
        1800.0
    )

    fees.forEachIndexed { index, salary ->
        fees[index] = salary * 1.1
    }
    fees.forEach { println(round(it)) }
}
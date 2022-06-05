package one.dio.collections

import kotlin.math.round

fun main() {

    val rafael = Employee("Rafael", 5000.0)
    val danielle = Employee("Danielle", 4500.0)

    val employees = listOf(rafael, danielle)
    employees.forEach{ println(it) }

    println("Finding Danielle:")
    println(employees.find { it.name === "Danielle" })

    println("Sorted by salary:")
    employees
        .sortedBy { it.salary }
        .forEach { println(it) }
}

data class Employee(
    val name: String,
    val salary: Double
) {
    override fun toString(): String =
        """
            Name: $name
            Salary: $salary
        """.trimIndent()
}
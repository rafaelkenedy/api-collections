package one.dio.collections

fun main() {

    val rafael = Employee("Rafael", 5000.0)
    val danielle = Employee("Danielle", 4500.0)

    val employees = listOf(rafael, danielle)
    employees.forEach{ println(it) }

    println("Finding Danielle:")
    println(employees.find { it.name === "Danielle" })
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
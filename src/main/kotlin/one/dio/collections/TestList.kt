package one.dio.collections

fun main() {

    //Imutable List
    val rafael = Employee("Rafael", 5000.0, "MALE")
    val danielle = Employee("Danielle", 4500.0, "FEMALE")
    val daniel = Employee("Daniel", 3500.0, "MALE")

    val employees = listOf(rafael, danielle)
    employees.forEach{ println(it) }

    println("Finding Danielle:")
    println(employees.find { it.name === "Danielle" })

    println("Sorted by salary:")
    employees
        .sortedBy { it.salary }
        .forEach { println(it) }

    println("Sorted by gender:")
    employees
        .groupBy { it.gender}
        .forEach { println(it) }
}
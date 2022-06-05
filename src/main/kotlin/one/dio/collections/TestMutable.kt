package one.dio.collections

fun main() {

    val rafael = Employee("Rafael", 5000.0, "MALE")
    val danielle = Employee("Danielle", 4500.0, "FEMALE")
    val daniel = Employee("Daniel", 3500.0, "MALE")
    val rafaela = Employee("Rafaela", 5500.0, "FEMALE")

    val employees = mutableListOf(rafael, danielle, daniel)
    println("------------:")
    employees.forEach { println(it) }


    employees.add(rafaela)
    println("New employee:")
    println("------------:")
    employees.forEach { println(it) }


    employees.remove(rafaela)
    println("Remove employee: ")
    println("------------:")
    employees.forEach { println(it) }

    val employeesSet = mutableSetOf(danielle, rafaela)
    println("------------:")
    employeesSet.forEach { println(it) }


    employeesSet.add(rafael)
    employeesSet.remove(rafaela)
    println("------------:")
    employeesSet.forEach { println(it) }
}
package one.dio.collections

fun main() {
    val rafael = Employee("Rafael", 5000.0, "MALE")
    val danielle = Employee("Danielle", 4500.0, "FEMALE")
    val daniel = Employee("Daniel", 3500.0, "MALE")
    val rafaela = Employee("Rafaela", 3540.0, "FEMALE")

    val maleEmployees = setOf(rafael, daniel)
    val femaleEmployees = setOf(danielle, rafaela)

    val employeesUnion = maleEmployees.union(femaleEmployees)

    val newEmployees = setOf(rafael, daniel, rafaela)
    val employeesSubtract = newEmployees.subtract(femaleEmployees)
    val employeesIntersect = newEmployees.intersect(femaleEmployees)

    println("Union:")
    employeesUnion.forEach{ println(it) }
    println("Subtract:")
    employeesSubtract.forEach{ println(it) }
    println("Intersect:")
    employeesIntersect.forEach{ println(it) }

}
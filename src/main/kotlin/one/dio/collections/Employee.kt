package one.dio.collections


data class Employee(
    val name: String,
    val salary: Double,
    val gender: String
) {
    override fun toString(): String =
        """
            Name: $name
            Salary: $salary            
        """.trimIndent()
}

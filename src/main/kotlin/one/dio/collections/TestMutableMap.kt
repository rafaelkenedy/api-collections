package one.dio.collections

fun main() {

    val rafael = Employee("Rafael", 5000.0, "MALE")
    val danielle = Employee("Danielle", 4500.0, "FEMALE")
    val daniel = Employee("Daniel", 3500.0, "MALE")
    val rafaela = Employee("Rafaela", 5500.0, "FEMALE")

    val repository = Repository<Employee>()

    repository.create(rafael.name, rafael)
    repository.create(danielle.name, danielle)
    repository.create(daniel.name, daniel)
    repository.create(rafaela.name, rafaela)

    println(repository.findById(daniel.name))
    println(repository.findById(rafaela.name))
}
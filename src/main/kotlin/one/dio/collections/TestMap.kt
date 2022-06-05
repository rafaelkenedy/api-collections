package one.dio.collections

fun main() {
    val pair: Pair<String, Double> = Pair("Rafael", 5000.0)
    val players = mapOf(pair)

    players.forEach { (k, v) -> println("Key: $k -> Value: $v") }

    val otherPlayers = mapOf(
        "Daniel" to 5500.0,
        "Danielle" to 6500.0
    )

    otherPlayers.forEach { (k, v) -> println("Key: $k -> Value: $v")}

}
package OOP

data class GameItem (val id: Int, val name: String, val value: Int, var rarity: String)

fun main() {
    val listGameItem: MutableList<Any> = mutableListOf(
        GameItem(1, "Pedang Besi", 100, "Common"),
        GameItem(2, "Ramuan Kesehatan", 50, "Common"),
        GameItem(3, "Jubah Bayangan", 500, "Epic")
    )

    val pedangBesi = listGameItem
    val cursedSword = pedangBesi
    println()
}
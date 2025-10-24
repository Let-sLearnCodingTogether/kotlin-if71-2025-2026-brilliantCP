import java.beans.Introspector
import kotlin.math.absoluteValue

fun main() {
    val stokBarang = mapOf<String, Int>(
        "Buku Tulis" to 45,
        "Pena Pilot G-2" to 78,
        "Indomie Goreng" to 120,
        "Teh Kotak" to 30,
        "Binder B5" to 12,
        "Kopi Kapal Api" to 55
    )

    val minStock = stokBarang.minByOrNull { it.value }

    println("Barang dengan stok terendah adalah ${minStock?.key}")
}
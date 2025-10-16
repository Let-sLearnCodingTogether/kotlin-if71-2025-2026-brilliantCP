package OOP

data class Kendaraan(val merek: String, val tahun: Int)

fun main() {
    val tayo = Kendaraan("tayo", 2015)
//    println(tayo.merek)
    val(merek, tahun) = tayo
    println(merek)
    println(tahun)
}
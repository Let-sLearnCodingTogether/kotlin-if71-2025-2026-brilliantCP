package OOP

class PersegiPanjang (val panjang: Double,val lebar: Double) {
    val luas: Double
        get() = panjang * lebar
}

fun main() {
    val luasPersegiPanjang = PersegiPanjang(10.0, 12.0)
    println(luasPersegiPanjang.luas)
}
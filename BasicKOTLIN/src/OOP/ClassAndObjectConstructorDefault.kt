package OOP

class MahasiswaConstructorDefaultValue(
    val npm: String,
    val nama: String,
    var ipk: Float = 0.0f
) {
    init {
        println("Ini block init")
    }
}

fun main() {
    val mhsPertama = MahasiswaConstructorDefaultValue(
        "2226250018", "Brilliant"
    )

    val mhsKedua = MahasiswaConstructorDefaultValue(
        "2226250052",
        "Aan",
        3.4f
    )

    println(mhsPertama.ipk)
    println(mhsKedua.ipk)
}
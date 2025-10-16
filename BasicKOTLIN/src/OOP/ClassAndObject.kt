package OOP

class MahasiswaConstructor(
    val npm: String,
    val nama: String,
    var ipk: Float
)

fun main() {
    val mhsPertama = MahasiswaConstructor(
        npm = "2226250018",
        nama = "Brilliant",
        ipk = 1.3f
    )

    println(mhsPertama.npm)
    println(mhsPertama.nama)
    println(mhsPertama.ipk)

    mhsPertama.ipk = 1.2f
    println(mhsPertama.ipk)
}
package OOP

class MahasiswaThisKeyword(val nama: String){
    fun sayGooodBye(nama: String){
        println("$nama: ${this.nama}")
    }
}

fun main() {
    val mhsPertama = MahasiswaThisKeyword("Brilliant")

    mhsPertama.sayGooodBye("Mhs1")

}
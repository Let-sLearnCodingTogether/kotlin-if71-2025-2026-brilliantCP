package OOP

class MahasiswaFunction(val nama: String){
    fun sayHello(){
        println("Selamat Malam $nama")
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaFunction("Brilliant")
    mahasiswaPertama.sayHello()
}
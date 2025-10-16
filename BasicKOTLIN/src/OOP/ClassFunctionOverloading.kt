package OOP

class MahasiswaFunctionOverload(val nama: String){
    fun sayHello(){
        println("Selamat malam $nama")
    }

    fun sayHello(word: String){
        println("$word $nama")
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaFunctionOverload("Brilliant")
    mahasiswaPertama.sayHello("Selamat Pagi")
}
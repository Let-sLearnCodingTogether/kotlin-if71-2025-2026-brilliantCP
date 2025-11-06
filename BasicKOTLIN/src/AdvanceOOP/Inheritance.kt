package AdvanceOOP

open class Hewan(val name: String){
    open fun suara(){
        println("Suara hewan")
    }
}

open class Ayam(name: String): Hewan(name){
    final override fun suara(){
        println("Kukuruyuk")
    }
}

//class AnakAyam(name: String): Ayam(name){
//    override fun suara(){
//        println("Chirpchirp")
//    }
//}

class Sapi(name: String): Hewan(name){
    override fun suara(){
        println("Moo")
    }
}

fun main() {
    val rambo = Ayam("Rambo")
    rambo.suara()
}
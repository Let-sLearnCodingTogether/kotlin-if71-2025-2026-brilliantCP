package AdvanceOOP

open class Hewan2 {
    open fun suara() {
        println("Suara Hewan")
    }
}

class Bebek(): Hewan2(){
    override fun suara(){
        super.suara()
        println("Suara bebek: Kwek kwek")
    }
}

fun main() {
    val bebek = Bebek()
    bebek.suara()
}
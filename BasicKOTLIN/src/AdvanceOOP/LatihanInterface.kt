package AdvanceOOP

interface Electronic{
    val brand: String
    fun turnOff()
    fun turnOn()
    fun cleanDrive(){
        println("Membersihkan debu dari perangkat $brand")
    }
}

class Fan(override val brand: String): Electronic{
    override fun turnOff() {
        println("Kipas angin merek $brand berputar")
    }

    override fun turnOn() {
        println("Kipas angin merek $brand berhenti")
    }
}

class SmartLight(override val brand: String): Electronic{
    override fun turnOff() {
        println("Lampu merek $brand telah dimatikan")
    }

    override fun turnOn() {
        println("Lampu merek $brand telah dihidupkan")
    }

}

fun main() {
    val cosmos = Fan("Cosmos")
    cosmos.turnOn()
    cosmos.turnOff()

    val samsung = SmartLight("Bardi")
    samsung.turnOn()
    samsung.turnOff()
    samsung.cleanDrive()
}
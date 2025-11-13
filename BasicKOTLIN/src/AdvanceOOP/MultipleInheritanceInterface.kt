package AdvanceOOP

interface Wheeled {
    val numberOfWheels: Int
}

interface Vehicles{
    fun drive()
}

class SepedaRodaTiga(override val numberOfWheels: Int = 3): Vehicles, Wheeled {
    override fun drive() {
        println("sepeda dikayuh")
    }
}

fun main() {
    val sepedaRodaTiga = SepedaRodaTiga()
    println("Jumlah roda pada sepeda: ${sepedaRodaTiga.numberOfWheels}")
    sepedaRodaTiga.drive()
}
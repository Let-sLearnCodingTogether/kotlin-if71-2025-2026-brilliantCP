package AdvanceOOP

interface Vehicle{
    fun accelerate()
    fun stop()
}

class Motor1: Vehicle {
    override fun accelerate() {
        println("Accelerate")
    }

    override fun stop() {
        println("Stop")
    }
}

fun main() {
    val motor1 = Motor1()

    motor1.accelerate()
    motor1.stop()
}
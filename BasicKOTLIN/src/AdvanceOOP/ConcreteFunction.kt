package AdvanceOOP

interface SpaceVehicle {
    fun accelerate()

    fun stop(){
        println("Stop...")
    }
}

class LightSpace: SpaceVehicle {
    override fun accelerate() {
        println("Akselerasi...")
    }
}

fun main() {
    val lightSpace01 = LightSpace()
}
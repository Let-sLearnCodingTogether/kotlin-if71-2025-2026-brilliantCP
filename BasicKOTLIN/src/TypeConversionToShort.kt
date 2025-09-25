fun main() {
    val myInt : Int = 30000
    val myShort : Short = myInt.toShort()

    val myInt2 : Int = 40000
    val myShort2 : Short = myInt2.toShort()

    println(myShort)
    println(myShort2)
    println(Integer.toBinaryString(myInt2).padStart(length = 32, padChar = '0'))
    /**
     * 1001110001000000
     * Awal = 1, Negatif
     * Invert the biner = 01100011 10111111
     * 1 + 2 + 4 + 8 + 16 + 32 + 128 + 256 + 512 + 8192 + 16384
     * dengan rumus complement tambah 1 dari hasil convert desimal dari bilangan biner
     * (25535 + 1) * -1 = -25536
     */
}
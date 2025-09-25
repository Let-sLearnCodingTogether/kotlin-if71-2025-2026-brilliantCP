fun main() {
    val hariDalamSeminggu : Array<String> = arrayOf("Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu")

    println("====================================================")
    println("Jumlah hari : ${hariDalamSeminggu.size}")
    println("Hari pertama: ${hariDalamSeminggu.first()}")
    println("Hari terakhir: ${hariDalamSeminggu.last()}")
    hariDalamSeminggu[4] = "Jum'at Barokah"
    println("${hariDalamSeminggu[4]}")
    println("====================================================")
}
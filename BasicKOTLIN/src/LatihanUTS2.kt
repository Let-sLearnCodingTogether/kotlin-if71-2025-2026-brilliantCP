class Karyawan (val nama: String, val id: String, val gajiPokok: Double){

    fun tampilkanProfil(){
        println("Nama: ${nama}, ID: ${id}")
    }

    fun hitungGajiBulanan(jumlahHariMasuk: Int): Double{
        val gajiBulanan = (jumlahHariMasuk.toDouble()/22) * gajiPokok
        return gajiBulanan
    }
}

fun main() {
    val karyawanA = Karyawan("Budi", "K001", 1600000.0)
    val karyawanB = Karyawan("Andre", "K002", 1500000.0)

    karyawanA.tampilkanProfil()
    karyawanB.tampilkanProfil()

    println("Gaji bulanan budi: ${karyawanA.hitungGajiBulanan(20)}")
    println("Gaji bulanan andre: ${karyawanB.hitungGajiBulanan(22)}")
}
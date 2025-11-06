package AdvanceOOP

open class Pegawai(val nama: String, val gajiDasar: Int){
    open fun hitungGaji(){
        println("Gaji $nama: Rp$gajiDasar")
    }
}


class Manager(name: String, gajiDasar: Int): Pegawai(name, gajiDasar){
    override fun hitungGaji(){
        println("Gaji $nama: Rp$gajiDasar")
    }
}

class Programmer(name: String, gajiDasar: Int): Pegawai(name, gajiDasar){
    override fun hitungGaji(){
        println("Gaji $nama: Rp$gajiDasar")
    }
}

fun main() {
    val listPegawai = listOf<Pegawai>(
        Manager("Budiono", 4000000),
        Manager("Siregar", 4500000),
        Programmer("Gilang", 6000000),
        Programmer("Galang", 7000000)
    )

    for (pegawai in listPegawai){
        pegawai.hitungGaji()
    }

}
package OOP

import kotlin.properties.Delegates

class NilaiMahasiswa {
    var nilai: Float by Delegates.vetoable(0.0f) { property, oldValue, newValue ->
        if (newValue > 0.0f && newValue <= 100.0f){
            println("Nilai berhasil diubah")
            true
        } else{
            println("Nilai harus > 0 dan <= 100")
            false
        }
    }
}

fun main() {
    val nilaiMhs = NilaiMahasiswa()
    nilaiMhs.nilai = -10.0f
}
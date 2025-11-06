package AdvanceOOP

sealed class HasilOperasi(){
    data class Success(val message: String): HasilOperasi()
    data class Error(val message: String): HasilOperasi()
    object Loading: HasilOperasi()
}

fun prosesHasil(hasilOperasi: HasilOperasi){
        when(hasilOperasi){
            is HasilOperasi.Loading -> println("System Loading...")
            is HasilOperasi.Success -> println("Success")
            is HasilOperasi.Error -> println("Error")
        }
}

fun main() {
    prosesHasil(HasilOperasi.Loading)
    prosesHasil(HasilOperasi.Success("Success"))
    prosesHasil(HasilOperasi.Error("Error"))
}
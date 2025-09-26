fun vila1(firstName : String, vararg nomorRumah : String) {
    println(firstName)
    for(nomor in nomorRumah){
        println(nomor)
    }
}

fun main() {
    vila1("Blok 1", "Blok 2", "Blok 3", "Blok 4")
}
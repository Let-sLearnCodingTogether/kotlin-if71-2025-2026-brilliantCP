fun main() {
    var student : String = "Budi"
    println(student)

//    student = null
    var prodiIf : String? = "IF" //if filled with null = null
    println(prodiIf?.length)

    val prodiSi : String? = "SI"
    println(prodiSi ?: "Tanpa Prodi")

//    var token : String? = null
//    println(token!!.length)

    val email: String? = "test@mail.com"
    if(email != null){
        println(email.length)
    }
}
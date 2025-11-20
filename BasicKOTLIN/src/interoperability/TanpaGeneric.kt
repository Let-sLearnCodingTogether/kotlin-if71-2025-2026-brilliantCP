package interoperability

class ExampleGeneric(val data: Any)

fun main() {
    val kotakAngka = ExampleGeneric(100)
    val kotakKata = ExampleGeneric("Halo")

    val hasil = kotakAngka.data as Int
    println(hasil + 10)

    val errorNanti = kotakKata.data as Int
}
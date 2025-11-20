package interoperability

class ExampleGeneric1<T>(val data: T)

fun main() {
    val kotakAngka = ExampleGeneric1<Int>(100)

    val kotakKata = ExampleGeneric1<String>("Halo")

    val hasil = kotakAngka.data
    println(hasil + 10)
}
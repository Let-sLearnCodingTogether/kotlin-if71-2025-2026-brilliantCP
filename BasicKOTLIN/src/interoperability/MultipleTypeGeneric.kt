package interoperability

class ExampleMultipleType<T, U>(val pertama: T, val kedua: U)

fun main() {
    val status = ExampleMultipleType<String, Int>("Sukses", 200)
    println("Status: ${status.pertama}, Code: ${status.kedua}")
}
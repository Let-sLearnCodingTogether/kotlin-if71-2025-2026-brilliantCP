package LatihanUAS.Soal3

interface Stack<Element> {
    fun push(element: Element)
    fun pop(): Element?
    fun peek(): Element?
}

class StackImpl<T: Any>: Stack<T> {
    private val storage = arrayListOf<T>()

    override fun toString(): String {
        return storage.asReversed().toString()
    }

    override fun push(element: T) {
        storage.add(element)
    }

    override fun pop(): T? {
        if(storage.isEmpty()) return null
        return storage.removeAt(storage.size - 1)
    }

    override fun peek(): T? {
        return storage.getOrNull(0)
    }
}

fun main() {
    val NilaiAkhir = StackImpl<Int>()

    NilaiAkhir.push(10)
    NilaiAkhir.push(20)
    println(NilaiAkhir)

    NilaiAkhir.pop()
    println(NilaiAkhir)

    NilaiAkhir.peek()
    println(NilaiAkhir)
}
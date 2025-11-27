package FunctionalProgramming

fun addPureFunction(a: Int,b: Int): Int = a + b

var count = 0 // global dianggapnya
fun addImpureFunction(a: Int): Int{
    count += 1
    return a + count
}

fun main() {
    addPureFunction(1, 2) //3
    addPureFunction(1, 2) //3
    addPureFunction(1, 2) //3

    addImpureFunction(1) //2
    addImpureFunction(1) //3
}
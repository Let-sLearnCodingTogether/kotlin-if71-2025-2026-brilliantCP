package interoperability

class MyData<T>(val firstData: T){
    fun getData(): T{
        return firstData
    }

    fun printData(){
        println("Data is: $firstData")
    }
}

fun main() {
    val dataString = MyData<String>("Kelas IF71")
    dataString.printData()

    val dataInt = MyData<Int>(2025)
    dataInt.printData()
}
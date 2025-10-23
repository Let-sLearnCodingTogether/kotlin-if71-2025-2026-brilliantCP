package OOP

class Mahasiswas(ipk: Double){
    var ipk: Double = ipk
        set(value) {
            field = if(value < 0) 0.0 else if (value > 4.0) 4.0 else value
         }
}

fun main() {
    var ipk = Mahasiswas(3.8)
    println(ipk.ipk)

    ipk.ipk = -0.5
    println(ipk.ipk)

    ipk.ipk = 4.3
    println(ipk.ipk)
}

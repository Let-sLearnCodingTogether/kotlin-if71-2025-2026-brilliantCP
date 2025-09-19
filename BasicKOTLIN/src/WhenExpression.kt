fun main() {
    val finalExam = 'A'
    val nilaiLulus = arrayOf('A', 'B')

    when(finalExam){
        'A' -> println("Lulus")
        'B' -> println("Lulus juga")
        'C' -> println("Ya bisa lulus")
        else -> println("Tidak lulus")
    }

    when(finalExam){
        'A', 'B' -> println("Lulus")
        'C' -> println("Ya bisa lulus")
        else -> println("Tidak lulus")
    }

    when {
        finalExam == 'A' || finalExam == 'B' -> println("Lulus")
        finalExam == 'C' -> println("Ya bisa lulus")
        else -> println("Tidak lulus")
    }

    var status = false
    when(finalExam){
        'A', 'B' -> status = true
        else -> status = false
    }

    val status1 = when(finalExam){
        'A', 'B' -> true
        else -> false
    }

    println("Status lulus = $status1")

    when(finalExam){
        in nilaiLulus -> println("Lulus")
        !in nilaiLulus -> println("Tidak lulus")
    }

    when(finalExam){
        is Char -> println("ya, ini nilai char")
        is String -> println("Ini String")
        !is Char -> println("bukan, ini bukan nilai char")
    }

    var a = 32

    when{
        a < 16 -> {
            a = 32
            println(a)
        }
        a > 16 -> {
            a = 64
            println(a)
        }
    }
}
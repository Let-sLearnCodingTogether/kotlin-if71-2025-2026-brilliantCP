import kotlin.math.max

fun main() {
    print("Nama kamu : ")
    val namaPemain : String = readln()
    var kesehatanPemain : Int = 100

    var punyaKunciEmas : Boolean = false
    var jumlahPotion : Int = 2
    var statusBermain : Boolean = true

    while (statusBermain == true){

        println("Name : $namaPemain")
        println("HP : ${kesehatanPemain}")
        println("Potion : $jumlahPotion")

        print("1. Jalur gelap dan seram\n2. Jalur tenang dan sunyi\nPilih jalur goamu : ")
        var playerChoice : String = readln()
        if(playerChoice == "1"){
            println("Anda masuk ruang teka-teki")
            println("Naga(1)\nGriffin(2)\nUlar(3)\nGunakan Potion(y)\nPilih salah satu dari tiga patung : ")
            var patungChoice : String = readln()
            when(patungChoice){
                "1" -> {
                    println("Naga menembakkan api, kesehatan anda berkurang 35.")
                    kesehatanPemain = kesehatanPemain - 35
                }
                "2" -> {
                    println("Anda mendapatkan kunci emas.")
                    punyaKunciEmas = true
                }
                "3" -> {
                    println("Anda tergigit ular, kesehatan anda berkurang 15.")
                    kesehatanPemain = kesehatanPemain - 15
                }
                "y" -> {
                    println("Anda telah menggunakan potion, kesehatan bertambah 10")
                    if (kesehatanPemain == 100) {
                        println("Kesehatan anda telah penuh")
                    }else if (jumlahPotion == 0){
                        println("Anda kehabisan potion")
                    }else{
                        kesehatanPemain = kesehatanPemain + 10
                        jumlahPotion -= 1
                    }
                } else -> {
                    println("Anda terjatuh ke lobang dan tidak pernah kembali.\nGAME OVER")
                    break
                }
            }
        }
        else if(playerChoice == "2") {
            println("Anda menginjak trap, kesehatan berkurang 25")
            kesehatanPemain = kesehatanPemain - 25
        }
        println("Kamu telah sampai di pintu terakhir")
        when(punyaKunciEmas){
            true -> {
                println("Kamu menggunakan kunci emas dan menemukan artefak kuno!")
                statusBermain = false
            }
            else -> {
                println("Pintu terkunci dan membutuhkan kunci emas.")
//                statusBermain = false
            }
        }
        if(kesehatanPemain <= 0){
            kesehatanPemain = 0
            println("Kamu tewas mengenaskan")
            statusBermain = false
            break
        }

    }
}
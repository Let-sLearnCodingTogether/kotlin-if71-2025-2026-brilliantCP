package OperatorOverloadingAndConvertion

data class Mana(var current: Int, var max: Int){
    operator fun plus(other: Mana): Mana{
        val sum = current + other.current
        if(sum <= max){
            return Mana(sum, max)
        }
        return Mana(max, max)
    }

    operator fun minus(reduce: Int): Mana{
        val deduct = current - reduce
        if(deduct > 0){
            return Mana(deduct, max)
        }
        return Mana(0, max)
    }

    operator fun inc(): Mana{
        val increment = current + 10
        if(increment <= max){
            return Mana(increment, max)
        }
        return Mana(max, max)
    }

}

fun main() {
    var mana1 = Mana(50, 100)
    var mana2 = Mana(60, 50)
    println(mana1 + mana2)
    mana1++
    println(mana1)
    println(mana1 - 90)

}
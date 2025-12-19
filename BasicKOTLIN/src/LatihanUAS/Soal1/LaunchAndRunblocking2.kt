package LatihanUAS.Soal1

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main() = runBlocking {
    println("Mulai...")
    launch {
        download()
    }
    println("Selesai.")
}

suspend fun download(){
    println("Download Data...")
    delay(3000)
}
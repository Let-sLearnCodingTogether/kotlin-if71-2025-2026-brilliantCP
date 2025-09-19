fun main() {
    val users : Array<String> = arrayOf("user 1", "user 2", "user 3")

    println(users[0])
    println(users.get(1))

    users.set(2, "user 3 update")
    println(users[2])
    users[2] = "user 3 update again"
    println(users[2])
    
    println("Size : ${users.size}")

}
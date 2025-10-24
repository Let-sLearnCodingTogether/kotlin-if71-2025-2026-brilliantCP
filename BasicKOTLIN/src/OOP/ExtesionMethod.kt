package OOP

//library yang kita tidak punya akses
class UserProfile1(val username: String){}

fun UserProfile1.usernameToUppercase(): String {
    return this.username.uppercase()
}

fun main() {
    val user1 = UserProfile1("tom")
    println(user1.usernameToUppercase())
}
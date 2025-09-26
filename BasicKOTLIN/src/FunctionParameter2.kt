fun sayHello1(firstName : String, lastName : String = "Tanpa lastName"){
    println("Hello, $firstName $lastName")
}

fun main() {
    sayHello1("Brilliant", "CP")
    sayHello1("MDP")
}
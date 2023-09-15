fun main() {
    println("Hello")
    sayHello()
    sayHelloTo("Peter")
    sayHelloFrom("Bruce Wayne","Gotham City")
    println("El doble de 25 es ${duplicate(25)}") // Llamado a función dentro de String
    val result=divide(99,15.0)
    println("El resultado de 99 / 15 es $result")
    println(fullName("John","Snow"))

    welcomeToMexico()
    welcomeToMexico("Spider-man")

    // Parámetros con nombre
    sayHelloFrom("Superman","Metropolis")
    sayHelloFrom(city="Namekusei",name="Piccoro")
}

// Funciones sin parámetros ni retorno
fun sayHello(){
    println("Hi!")
}

// Funciones con parámetros sin retorno
fun sayHelloTo(name:String){
    println("Hello $name")
    println("Welcome")
}

fun sayHelloFrom(name:String,city:String){
    println("Hello $name from $city")
}

/* Funciones con retorno
   Necesitan especificar el tipo de dato */
fun duplicate(num: Int): Int {
    return num * 2
}

fun divide(num1:Int,num2:Double):Double{
    return num1/num2
}

fun fullName(firstName:String,lastName:String):String{
    return "$firstName $lastName"
}

// Funciones con parámetros opcionales
fun welcomeToMexico(name:String="Invitado"):Unit{
    println("Welcome to Mexico $name")
}
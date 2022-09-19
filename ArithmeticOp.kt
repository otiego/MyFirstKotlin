
fun main(){
    val x = 5
    val y=2.5
    println(x/y)

    val a = 10%3
    println("The value of a is $a")

    val d = 7*6
    println("The value of d is $d")

    val s = 5%2
    println("The value of s is $s")

    val iAmAdult = true
    val iAmProgrammer = true
    val iAmAdultProgrammer = iAmAdult && iAmProgrammer
    println("It is $iAmAdultProgrammer I am an adult programmer")

//    Getting values from user
    val number1 = readLine()//the readLine() function takes only strings
    val number2 = readLine()
    val result = number1!!.toInt() + number2!!.toInt()//Kotlin cannot add strings. We must convert the strings received to integer using .Int() function
    println(result)
}
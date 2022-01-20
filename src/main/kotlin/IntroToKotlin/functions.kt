package IntroToKotlin

fun main()
{
    //declaration
    println(addNumbers(4,5))
    printUserName("john")
}
fun addNumbers(x: Int, y: Int): Int{
    return x+y
}
fun printUserName(name: String)
{
    println(name)
}
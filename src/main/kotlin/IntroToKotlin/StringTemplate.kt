package IntroToKotlin

fun main()
{
    //String template
    val flatNumber: Int = 25
    val address: String = "Tower 2, Flat No. " + flatNumber
    println(address)

    val flateNumber1: Int = 23
    val address1: String = "Tower 2, Flat No. $flateNumber1"
    println(address1)

    val name: String = "John Doe"
    println("name is ${name.length} character long")
}
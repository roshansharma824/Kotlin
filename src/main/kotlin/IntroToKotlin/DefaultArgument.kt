package IntroToKotlin

fun main()
{
    printUserName1("John","Frost")
    printUserName1("John")

}
fun printUserName1(firstName: String,lastName: String="Doe")
{
    println("the name is $firstName $lastName")
}
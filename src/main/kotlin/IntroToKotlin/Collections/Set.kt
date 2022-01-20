package IntroToKotlin.Collections

fun main()
{
    val names = setOf("john","mark","finn")
    println("1. The size of set is ${names.size}")
    println("2. set contains ${names.contains("finn")}")

}
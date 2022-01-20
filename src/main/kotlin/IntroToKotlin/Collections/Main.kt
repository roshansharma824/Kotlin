package IntroToKotlin.Collections

fun main()
{
    val names = listOf("john","mark","sarah","finn")
    println("1. The size of the list is ${names.size}")
    println("2. The second item in the list is ${names.get(1)}")
    println("3. The second item in the list using index opretor ${names[1]}")
    println("4. Finn at the index ${names.indexOf("finn")} in the last")
//    names.add("sarah")   // Error

}
package IntroToKotlin

fun main()
{
    var a = 0
    var b = 1
    var c = 0
    val n = 14
    while (a<n)
    {
        c = a+b
        a = b
        b = c
    }
    if (a == n)
    {
        println("true")
    }
    else
    {
        println("false")
    }


}
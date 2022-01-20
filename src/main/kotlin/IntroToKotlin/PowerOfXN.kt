package IntroToKotlin

import java.util.*

fun main()
{
    val s = Scanner(System.`in`)
    val x = s. nextInt()
    var n = s.nextInt()
    var ans = 1
    while (n>0)
    {
        ans = ans*x
        n--
    }
    println(ans)
}
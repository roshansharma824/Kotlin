package IntroToKotlin

import java.util.*

fun main()
{
    pattern1()
}
fun pattern1()
{
//    1
//    21
//    321
//    4321
//    54321
    val s = Scanner(System.`in`)
    val n = s.nextInt()
    for (i in 1..n)
    {
        for (j in i downTo 1)
        {
            print(j)
        }
        println()
    }
}

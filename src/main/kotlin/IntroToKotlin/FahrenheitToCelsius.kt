package IntroToKotlin

import java.util.*

fun main()
{
    var s = Scanner(System.`in`)
    var S = s.nextInt()
    var E = s.nextInt()
    var W = s.nextInt()
    for (i in S..E step W)
    {
        var F = (5.0/9)*(i-32)
        println("$i\t${F.toInt()}")
    }
}
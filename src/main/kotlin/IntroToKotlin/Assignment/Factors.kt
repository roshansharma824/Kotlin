package IntroToKotlin

import java.util.*

fun main(args: Array<String>)
{
    val read = Scanner(System.`in`)
    val n = read.nextInt()
    printFactors(n)
}

fun printFactors(num: Int)
{
    var i:Int = 2

    while (i<num)
    {
        if (num%i == 0)
        {
            print("$i ")
            i++
        }
        else
        {
            i++
        }
    }
}






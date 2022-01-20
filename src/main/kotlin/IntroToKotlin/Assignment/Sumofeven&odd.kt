package IntroToKotlin

import java.util.*

fun main(args: Array<String>)
{
    val read = Scanner(System.`in`)
    val n = read.nextInt()
    printSumOddEven(n)
}
fun printSumOddEven(x: Int)
{
    var n:Int = x
    var even:Int = 0
    var odd:Int = 0
    var r:Int = 0
    while (n != 0)
    {
        r = n%10
        if (r%2 == 0 && r != 0)
        {
            even += r
        }
        else
        {
            odd += r
        }
        n=n/10
    }
    println("$even $odd")
}


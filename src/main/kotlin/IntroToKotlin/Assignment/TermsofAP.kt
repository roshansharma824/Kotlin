package IntroToKotlin

import java.util.*

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    var x = read.nextInt()

    printAP(x)
}

fun printAP(num : Int) {
    var n:Int = num
    var i:Int = 1
    var count:Int = 0
    while (count<num)
    {
        var ans = 3*i+2
        if(ans%4 != 0)
        {
            print("$ans ")
            count++
            i++
        }
        else
        {
            i++
        }

    }

    //write your code here
}
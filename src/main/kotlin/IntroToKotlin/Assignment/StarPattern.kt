package IntroToKotlin

//Sample Input 2 :
//4
//Sample Output 2 :
//    *
//   ***
//  *****
// *******


import java.util.*

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val n = read.nextInt()

    //printStarPattern(n)


}

fun printStarPattern(n: Int) {

    for (i in 1..n)
    {
        for (j in 1..n-i)
        {
            print(" ")
        }
        for (k in 1..i)
        {
            print("*")
        }
        var l = i
        while (l-1>0)
        {
            print("*")
            l--
        }
        println()
    }

}

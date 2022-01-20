package IntroToKotlin

import java.util.*

//main
fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val n = read.nextInt()

    //reading user input
    for(i in 1..n) {
        val size = read.nextInt()
        val arr = IntArray(size){ read.nextInt() }
        val x = read.nextInt()
        println(pairsWithSum(arr, size, x))
    }
}



fun pairsWithSum(arr: IntArray, size: Int, x: Int) : Int {
    var count:Int = 0
    for(i in 0..size-2)
    {
        for(j in i+1 until size)
        {
            if(arr[i]+arr[j] == x)
            {
                count++

            }
        }

    }
    return count
    //write your code here
}
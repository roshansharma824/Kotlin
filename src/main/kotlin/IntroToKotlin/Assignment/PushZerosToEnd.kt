package IntroToKotlin.Assignment

import java.util.*

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)

    //reading user input
    val t = read.nextInt()
    for(i in 1..t) {
        val size = read.nextInt()
        val arr = IntArray(size){ read.nextInt() }
        pushZerosToEnd(arr, size)
        arr.forEach { print("$it ") }
        println()
    }
}


fun pushZerosToEnd(arr: IntArray, size: Int) {
    var arr2 = IntArray(size)
    var j:Int = 0
    for (i in arr.indices)
    {
        if (arr[i] != 0)
        {
            var temp: Int = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
            j++
        }
    }


    //write your code here
}
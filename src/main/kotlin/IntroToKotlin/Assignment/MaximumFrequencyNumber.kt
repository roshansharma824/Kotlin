package IntroToKotlin

import java.util.*

fun main(args: Array<String>)
{
    val read = Scanner(System.`in`)
    val size = read.nextInt()
    val arr = IntArray(size){read.nextInt()}
    println(highestFrequency(arr))

}
fun highestFrequency(arr: IntArray): Int
{

//    var count = Integer.MIN_VALUE
//    var value = Integer.MIN_VALUE
//    val map = mutableMapOf<Int,Int>()
//
//    for (i in arr)
//    {
//        if (map.containsKey(i))
//        {
//            map[i] = map[i]!! + 1
//        }
//        else
//        {
//            map[i] = 1
//        }
//    }
//    for (i in arr)
//    {
//        if (map[i]!! > count)
//        {
//            count = map[i]!!
//            value = i
//        }
//    }
//    return value



    // Coding ninja's Solution
    var freq = mutableMapOf<Int,Int>()

    for (i in arr)
    {
        if(!freq.containsKey(i))
        {
            //freq.put(i,1)
            freq[i] = 1
        }
        else
        {
            var a: Int? = freq[i]//freq.get(i)
            freq[i] = a?.plus(1)?: 0 // freq.put(i, a?.plus(1) ?: 0)
        }
    }
    var maxfreq:Int = Integer.MIN_VALUE
    var ans:Int = 0
    for (i in arr)
    {
        if (freq[i]!! > maxfreq)
        {
            maxfreq = freq[i]!!
            ans = i
        }
    }
    freq.forEach { (k, v) ->
        if (v > maxfreq)
        {
            maxfreq = v
            ans = k
        }
    }
    return ans

}
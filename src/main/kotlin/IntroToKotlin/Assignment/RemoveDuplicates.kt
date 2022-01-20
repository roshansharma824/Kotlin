package IntroToKotlin.Assignment

import java.util.*

fun main(args: Array<String>)
{
    val read = Scanner(System.`in`)
    val size = read.nextInt()
    var arr = IntArray(size){read.nextInt()}

}

fun printDuplicateFree(arr: IntArray)
{
    val map = mutableMapOf<Int,Int>()
    for (i in arr)
    {
        if (!map.containsKey(i))
        {
            map[i] = 1
        }
        else
        {
            var a:Int? = map[i]
            map[i] = a?.plus(1)?:0
        }
    }


    map.forEach{ (k,v) ->
            print("$k ")
    }


    // coding ninja's solution
    var set = mutableSetOf<Int>()
    arr.forEach {
        set.add(it)
    }
    set.forEach{
        print("$it ")
    }



}




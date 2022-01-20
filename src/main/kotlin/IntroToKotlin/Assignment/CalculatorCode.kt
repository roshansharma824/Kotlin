package IntroToKotlin.Assignment

import java.util.*

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    var inout1  = read.nextDouble()
    var input2  = read.nextDouble()
    var operator = read.next()

    inout1 = calculate(inout1,input2,operator)
    var str: String = read.next()

    while(str == "y")
    {
        operator = read.next()
        input2 = read.nextDouble()
        inout1 = calculate(inout1,input2,operator)
        str = read.next()

    }
    println(inout1)
    //write your code here
}

fun calculate(input1:Double,input2:Double,operator:String): Double{
    when(operator)
    {
        "+" -> return input1+input2
        "-" -> return input1-input2
        "*" -> return input1*input2
        "/" -> return input1/input2
    }


    //write your code here

    return 0.0
}
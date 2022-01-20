package Generics

import IntroToKotlin.forLoop

//class ListExample{
//    //Use-site Variance / Type Projection
//    fun copy(from: MutableList<out Any>, to: MutableList<Any>)
//    {
//        for (i in from.indices)
//        {
//            to.add(from[i])
//        }
//    }
//}
//
//fun main()
//{
//    val any: MutableList<Any> = mutableListOf("John",7)
//    val numbers: MutableList<Int> = mutableListOf(1,2,3)
//    ListExample().copy(numbers,any)
//    println(any)
//}


//class Football
//{
//    fun shoot(shoot: MutableList<out Any>,scoreList: MutableList<Any>)
//    {
//        for (i in shoot.indices)
//        {
//            scoreList.add(shoot[i])
//        }
//    }
//}
//fun main()
//{
//    val scoreArray: MutableList<Any> = mutableListOf(3,4)
//    val shooter: MutableList<Int> = mutableListOf(1,2,3)
//    Football().shoot(shooter,scoreArray)
//    println(scoreArray[3])
//}
//fun main()
//{
////    val number1:String?= null
////    println(number1!!.length?:0)
////    val number1:Double=10.0
////    val sval:Long=number1
////    println(sval)
//    val x:Int=7
//    val y:Long?= x as? Long
//    println(y)
//}

//fun main() {
//    var output: String?= null
//    output= concater("Coding Ninjas")+ ":"+
//            addNumbers(3,4)
//    println(output)
//}
//fun addNumbers(x: Int,y: Int) =x*y
//fun concater(substring: String) ="The result is"

//fun main() {
//    var str  = "Hello Kotlin Strings"
//    var s = String()
//    s = "Hello KOTLIN Strings"
//    println(s.compareTo(str,true))


//    val arr1 = arrayOf(1, 2, 3, 4, 5)
//    val arr2 = intArrayOf(1, 2, 3, 4, 5)
//    val arr3 = intArray(1, 2, 3, 4, 5)
//    val arr4 = IntArray(5, { index -> index + 1 })
//    val arr5 = [1, 2, 3, 4, 5]


    //forEach( i in 1 … 5) {}


        //(1 … 5).forEach {}


           // (i in 1 … 5).forEach {}



//}
//fun main(args: Array<String>){
//    var i = 6
//    do {
//        print("$i, ")
//    } while (i--);
//}


//class customClass<T> {
//    fun<T> customfunc(stringPar: T){
//        println(stringPar)
//    }
//    fun sum(n: T)
//    {
//        println(n)
//    }
//}
//
//fun main() {
//    val obj= customClass<Double>()
//    obj.customfunc("Generics are fun")
//    obj.sum(2.0)
//}




















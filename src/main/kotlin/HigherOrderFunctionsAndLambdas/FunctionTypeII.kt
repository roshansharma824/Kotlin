package HigherOrderFunctionsAndLambdas
//
//fun getSum(x: Int, y: Int): Int{
//    return x+y
//}
//
////higher order function
//fun performOperation(x: Int, y: Int, fn: (Int,Int) -> Int)
//{
//    val result = fn(x,y)
//    println("Result of $x and $y is: $result")
//}
//
//// return a function
//fun getLength(): (String) -> Int{
//    return {x: String -> x.length}
//}
//
//fun main()
//{
//    //pass function as parameter
//    performOperation(2,4, ::getSum)
//
//    performOperation(8,1,{x,y -> x-y})
//
//    performOperation(7,6,fun (x: Int,y:Int): Int = x*y)
//
//    val f: (String)->Int = getLength()
//    println("Length is ${f("Mark")}")
//}




//Quiz 1 What is the output of the following code?
//fun doSomething(x: Int, fn: (x: String, y:Int)->Int):Int
//{
//    val x = "Coder"
//    val result = fn(x,20)
//    println(result)
//    return result+1
//
//}
//
//fun main()
//{
//    val result = doSomething(2,{x,y -> x.length/y})
//    println(result)
//}


//Quiz 2 Predict Output or Error

//var lambda1 = { println("Lambda expression")}
//
//fun main(args: Array<String>)
//{
//    lambda1()
//}











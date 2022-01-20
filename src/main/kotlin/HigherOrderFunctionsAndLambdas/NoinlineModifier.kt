package HigherOrderFunctionsAndLambdas

//inline lambda/anonymous function parameters can't be store in variable, passed to another function
//inline fun printName(name: String, fn: (String)-> Unit, noinline fn1: (Int, Int)-> Unit)
//{
//    fn(name)
//    printSum(fn1)
//}
//fun printSum(fn: (Int,Int) -> Unit)
//{
//    fn(4,7)
//}
//
//fun main()
//{
//    val name: String = "John"
//    printName(name,{println(it)},){x: Int, y:Int -> println("The sum of number is${x+y}")}
//
//}



//Quiz
//inline fun performOp(number: Int,noinline fn:(Int) -> Unit)
//{
//    doOp(fn)
//}
//fun doOp(fn: (Int)-> String)
//{
//    fn(2)
//}
//fun main()
//{
//    performOp(3,{ println("New Number")})
//}












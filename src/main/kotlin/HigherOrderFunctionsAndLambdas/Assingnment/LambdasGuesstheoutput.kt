package HigherOrderFunctionsAndLambdas.Assingnment

//fun <T> higherFunction(value: T, abc: (value: T)-> Unit)
//{
//    println(abc(value))
//}
//
//fun main()
//{
//    val printValue: (Any) -> String = {value -> "value: $value"}
//    higherFunction("123",printValue)
//}
//


//fun<T> higherFunction(value: T, abc: (value: T) -> String) {
//    println(abc(value))
//}
//fun main(){
//    val<T> printValue : (T) -> String = {value -> "value:$value"}
//        higherFunction("123", printValue)
//    }



//fun main(){
//    var res = 0
//    val myList = listOf(1,2,3,4,5,6,7,8,9,10)
//    myList.forEach {
//        var curr = it
//        res+=curr
//    }
//    println("sum: $res, lst: $curr")
//}


//inline fun multiplyByTwo( num:Int, crossinline lambda(result:Int) -> Unit) : Int {
//    val res = num*2
//    lambda.invoke(res)
//    return res
//}
//fun main(){
//    val res = multiplyByTwo(5) {
//        println("The result is $it")
//    return
//}
//println("Main Output: $res")
//}


//fun main(args: Array<String>){
//    println("Main function starts,")
//    inlinedFunc({ print("Lambda expression 1,")
//        return },
//        { print("Lambda expression 2,")} )
//
//    print("Main function ends")
//}
//
//inline fun inlinedFunc( lmbd1: () -> Unit, lmbd2: () -> Unit) {
//    lmbd1()
//    lmbd2()
//}


//fun main(args: Array<String>) {
//    print(flag)
//}
//fun foo(i: Int ): Int{
//    var a =  i
//    return a
//}
//inline var flag : Boolean
//    get() = foo(10 ) == 10
//    set(flag) {flag}






package HigherOrderFunctionsAndLambdas

//Used for refied type, lambda return and to prevent runtime overhead
//inline to avoid overhead due to creation of an object
//if lambda is a closure the a new instance id created else singleton
//coveat: dont't inline bigger fuctions. minimize the code to lambda usage
// inline function cant't access non public members of a class

//inline fun performOperation(name: String,fn: (String) -> Unit)
//{
//    fn(name)
//}
//fun main()
//{
//    val name: String = "John"
//    performOperation(name){ println(it)}
//
//    //println(name)
//}


//Quiz1
//inline fun performOp(number:Int,fn:(Int)-> Unit ){
//    fn(number)
//}
//fun main() {
//    val number: Int = 255
//    val string:String= "Value"
//    performOp(number){
//        println("$string:"+number.and(254))}
//}









package Exceptions



//Quiz 1
//fun main(){
//
//    try{
//        return
//    }
//    catch(ex: Exception){
//
//    }
//    finally{
//        println("Inside finally block")
//    }
//
//}



// Quiz 2
fun main(args: Array<String>) {
    try{
        val a = IntArray(5)
        a[10] = 99
    }

    catch(e: Exception){
        println("Some error occurred")
    }
    catch(e: ArithmeticException){
        println("ArithmeticException occurred")
    }
    catch(e: NumberFormatException){
        println("Number format exception")
    }
    catch(e: ArrayIndexOutOfBoundsException){
        println("Array index is out of range")
    }
    println("Out of try catch block")
}
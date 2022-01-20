package IntroToKotlin

fun main()
{
    val arr = arrayOf(0,7,2,5,4,7,1,3,6)
    for (i in arr.indices)
    {
        for (j in i+1..arr.size-1)
        {
            if (arr[i] == arr[j])
            {
                println(arr[j])
            }
        }
    }
//    println(printName1("John"))
//    println(printName2("John"))
//    println(printName3("John"))
//    printName4("John")
    //println(printName5("John"))

    //println(returnTypeAsVoidSuccess())
    //println(XORSUM(2,3))

//    val age = 20
//    println("My age is: " + 20)
//    println(age/2 + "is the age of my sister")


//    val numbers= arrayOf(1,2,3,4)
//    println(numbers.joinToString("$"))

//    var names=mutableSetOf("1","2","3","coding ninjas")
//    names.add("1")
//    println(names)

//    val name:String?= null
//    println(name.length?:0)

    //noReturn()

//    val name:String? = null
//    println("My name is " + name?: "John")


//    var arr1  = Array(5){i -> (i+1).toString()}
//    arr1.set(5, "6")
//    arr1.forEach{ print("${it}, ")}

//    var i: UInt = 6u
//    do {
//        print("$i, ")
//        i--
//    } while (i<=5u);

    val mySet: Set<Any> = setOf(2,6,4,29,18,4,5)
    val remainList= mySet.drop(29)
    for(element in remainList){
        print("$element, ")
    }
}


//fun printName1(name: String) = "My name is " + name
//fun printName2(name: String?) = "My name is " + {name?: "John"}
//fun printName3(name: String = "John") = "My name is ${name}"
//fun printName4(name) = "My name is ${name?: "John"}"
//fun printName5(name: String?) = "My name is ${name?: "John"}"

//fun returnTypeAsVoidSuccess(): Void? {
//    println("Function can have Void as return type")
//    return null
//}



//fun XORSUM(a: Int,b:Int)= a.xor(b)


//fun noReturn() {
//    print("Inside Function No Return")
//
//}






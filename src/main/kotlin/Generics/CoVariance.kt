package Generics


//open class Fruit
//class Apple: Fruit()
//
////declaration-site variance
//class Box<out T>
//{
//    fun get(): T{ TODO("Return item of type T")}
//
//}
//
//fun main()
//{
//    val appleBox = Box<Apple>()
//    val box: Box<Fruit> = appleBox
//}


// Why return only?
//open class Fruit
//class Apple: Fruit()
//class Orange: Fruit()
//
//// declaration-site variance
//class Box<out T>
//{
//    fun get(): T{ TODO("Return item of type T")}
//    fun put(item: T){}
//}
//fun main()
//{
//    val appleBox = Box<Apple>()
//    val fruitBox : Box<Fruit> = appleBox
//    fruitBox.put(Orange())
//}




//QUIZ
//open class mammal
//class sloth: mammal()
//class bear:mammal()
//class zoo<out T>
//{
//    fun get(): T{TODO()}
//}
//fun main()
//{
//    val cage = zoo<sloth>()
//    val Cage: zoo<bear> = cage
//
//}




















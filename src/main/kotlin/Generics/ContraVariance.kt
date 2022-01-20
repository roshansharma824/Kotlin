package Generics

//open class Fruit
//class Apple: Fruit()
//
////declaration-site variance
//class Box<in T>
//{
//    fun put(item: T)
//    {
//
//    }
//}
//fun main()
//{
//    val fruitBox = Box<Fruit>()
//
//    val appleBox: Box<Apple> = fruitBox
//
//}

// why in only?
// declaration-site variance
//open class Fruit
//class Apple: Fruit()
//
////declaration-site variance
//class Box<in T>
//{
//    fun put(item: T){}
//    fun get(): T{ TODO("return item of type T")}
//}
//
//fun main()
//{
//    val fruitBox = Box<Fruit>()
//    val appleBox: Box<Apple> = fruitBox
//
//    val apple: Apple = appleBox.get()//return a fruit while an apple is required
//
//}



//Quiz1
//class Mammal<out T> {
//
//}
//fun main(){
//    val bird= Mammal<Nightingale>()
//    val night: Mammal<Bird> = bird
//}
//
//class Bird {
//
//}
//
//class Nightingale {
//
//}


//Quiz
//class Tesla<in T>{
//
//}
//fun main(){
//    val space= Tesla<SpaceX>()
//    val solar: Tesla<SolarCity> = space
//}
//
//class SpaceX {
//
//}
//
//class SolarCity {
//
//}
























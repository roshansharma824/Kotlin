package Classes

import Classes.Footballer.shoesBrand
import javax.lang.model.element.Name

//class Student(val name: String)
//{
//    inner class schoolBag()
//    {
//        fun printBagOwner()
//        {
//            println("This school bag belong to: $name")
//        }
//    }
//}
//fun main()
//{
//    Student("Mark").schoolBag().printBagOwner()
//}

// Quiz 1
class Footballer(val Name:String)
{
    inner class shoesBrand
    {
        fun printShoes(ShoesBrandName: String)
        {
            println("$Name owns $ShoesBrandName shoes")
        }
    }
}
fun main()
{
    Footballer("Roshan").shoesBrand().printShoes("Reebok")
}















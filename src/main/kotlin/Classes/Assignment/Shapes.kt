package Classes.Assignment
//
//import java.util.*
//
//open class Shapes {
//    var lsa = 0
//    var tsa = 0
//    var volume = 0
//    fun print() {
//        print("$lsa $tsa $volume")
//    }
//}
//class Sphere(r: Int): Shapes()
//{
//    init
//    {
//        lsa = 4*3*r*r
//        tsa = 4*3*r*r
//        volume = (r*r*r)*(4)
//
//    }
//    //
//}
//class Cylinder(r: Int, h: Int): Shapes()
//{
//    init
//    {
//        lsa = 2*3*r*h
//        tsa = 2*3*r*(r+h)
//        volume = 3*r*r*h
//
//    }
//    //
//}
//class Cube(s: Int): Shapes()
//{
//    init
//    {
//        lsa = 4*(s*s)
//        tsa = 6*(s*s)
//        volume = s*s*s
//    }
//    //
//}
//fun main(args: Array<String>)
//{
//    val read = Scanner(System.`in`)
//
//    when(read.nextInt())
//    {
//        1 ->
//        {
//            val r = read.nextInt()
//            Sphere(r).print()
//        }
//        2 ->
//        {
//            val r = read.nextInt()
//            val h = read.nextInt()
//            Cylinder(r,h).print()
//        }
//        3 ->
//        {
//            val r = read.nextInt()
//            Cube(r).print()
//        }
//    }
//}

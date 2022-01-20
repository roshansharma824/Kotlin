package YouTubeTutorial

//class Calculator{
////    var message: String? = null
//    lateinit var message: String
//    fun add(a: Int, b: Int): Int
//    {
//        return a+b
//    }
//    fun multiply(a: Int, b: Int): Int
//    {
//        return a*b
//    }
//}
class Person(namep: String,agep: Int)
{
    var name: String = namep
    get()
    {
        return field.uppercase()
    }
    var age: Int = agep
    set(value)
    {
        if (value>0)
        {
            field = value
        }
        else
        {
            println("age cant be negitive")
        }
    }
    var email: String? = null
    get() = field?.lowercase()
    set(value)
    {
        field = value
    }

}
fun main()
{
//    val obj = Calculator()
//    println(obj.add(2,3))
    val p1 = Person("roshan",20)
    p1.age = 21
    p1.age = -21
    println(p1.name)
    p1.email = "Roshansharma824@gmail.com"
    println(p1.email)


}
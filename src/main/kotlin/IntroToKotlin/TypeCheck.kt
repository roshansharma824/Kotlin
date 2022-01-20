//fun main()
//{
//    //type conversion
//    val a: Int = 10
//    val b: Long = a.toLong()
//    println(b)
//}

fun main()
{
    // Type checking
    val name: Any = "john"
    if(name is String)
    {
        println(name.length)
    }
}
fun main()
{
//    var name: String? = null
    // Safe call operator ?.
//    println(name?.length)

    //Elvis operator ?:
//    println(name?.length ?: 0)

    val number1: String? = null
    println(number1!!.length ?:0)
}
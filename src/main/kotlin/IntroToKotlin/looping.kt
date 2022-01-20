package IntroToKotlin

fun main()
{
    //forLoop()
    //forLoopRange()
    whileLoop()
}
fun forLoop()
{
    val names = arrayOf("jack", "john" , "frank")

    for(name in names)
    {
        println(name)
    }
    for( i in names.indices)
    {
        println(names[i])
    }
}

fun forLoopRange()
{
    println("Line 1:")
    for(i in 1..5)
    {
        print(i)
    }
    println("\nLine 2:")
    if (4 !in 5..10)
    {
        print("Not there")
    }
    println("\nLine 3:")
    for(i in 1 until 5)
    {
        print(i)
    }
    println("\nLine 4:")
    for(i in 1..5 step 2)
    {
        print(i)
    }
    println("\nLine 5:")
    for(i in 5 downTo 1)
    {
        print(i)
    }
}
fun whileLoop()
{
    var i=0
    while(i<5)
    {
        println("Hello World!")
        i++
    }
    var name: String?
    do {
        name = "john"
        print(name)
    }while (name == null)


}
//fun assignment1(args:Array<String>)
//{
//    var i = 6
//    do {
//        print("$i,")
//    }while (i--)
//}
package IntroToKotlin

fun main()
{
    // if/ else
    var discount = 0
    val price = 85
    if(price > 50)
    {
        discount = 10
    }
    else
    {
        discount = 3
    }
    println(discount)

    discount = if(price > 85) 10 else 3
    println(discount)
    main1()
}
fun main1()
{
    val rating  = 5
    val result = when(rating)
    {
        5 -> "High"
        3,4 -> "Good"
        1,2 -> "poor"
        else -> {
            println("No rating")
            "Zero"
        }
    }
    println("The rating is $result")
    assignment()
}
fun assignment()
{
    val x=3
    when(x)
    {
        0,1 -> println("x==0 or x==1")
        else -> print("otherwise")
    }
}
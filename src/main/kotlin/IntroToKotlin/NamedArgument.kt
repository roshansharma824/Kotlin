package IntroToKotlin

fun main()
{
    //Named argument
    println(volume("Record Box ",1,height = 10,width = 5))

}
fun volume(boxName: String, length: Int, width: Int, height: Int): Int
{
    print(boxName)
    return length * width * height
}
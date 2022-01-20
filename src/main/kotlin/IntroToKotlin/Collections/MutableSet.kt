package IntroToKotlin.Collections
fun main()
{
    val names = mutableSetOf("john", "mark" , "finn")
    names.add("mark") // do not add because set containe usinque elements
    println(names)
    names.remove("john")
    println(names)
}

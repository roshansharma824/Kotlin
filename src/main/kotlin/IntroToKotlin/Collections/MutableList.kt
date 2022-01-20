package IntroToKotlin.Collections

fun main()
{
    val names = mutableListOf("john", "mark" , "finn")
    names.add("sarah")
    println(names)

//    names.removeAt(1)
//    println(names)
    names.remove("mark")
    println(names)

    names.set(0,"michael")
    println(names)

    names[1] = "james"
    println(names)

    names.clear()
    println(names)

}
package Classes


class Coder(val name: String,val language: String)

fun Coder.coderInfo() = "$name codes in $language"

fun main()
{
    val c: Coder = Coder("James Gosling","Java")
    println(c.coderInfo())

}
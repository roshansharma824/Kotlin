fun main()
{
    //Not-null assertion operator
    printNameLength("john",null)

}
fun printNameLength(firstName: String?, lastName: String?)
{
    if (firstName != null)
    {
        //Not null assertion operator !!.
        println("Name: ${firstName.length} ${lastName!!.length} ")
    }
}
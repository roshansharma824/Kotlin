package YouTubeTutorial

open class Parent{
    init {
        println("Parent constructor called")
    }
    val name: String? = null
    open fun myMethod()
    {
        println("I am in parent")
    }
}
class Child: Parent()
{
    init {
        println("child constructor called")
    }
    val name1: String?=null
    fun myMethod2()
    {
        println("I am in child")
    }
}

fun main()
{
    val objChild: Child = Child()
//    objChild.myMethod()
//    objChild.myMethod2()
}
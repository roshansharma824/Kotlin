package YouTubeTutorial

abstract class Shape
{
    var name: String? = null
    abstract fun area(): Double
    abstract fun display()
}
class Circle(val radius: Double): Shape()
{
    override fun area(): Double
    {
        return Math.PI*radius*radius
    }

    override fun display() {
        println("Circle is getting displayed")
    }

}

fun main()
{
    val s = Circle(2.2)
    println(s.area())
    s.display()
}
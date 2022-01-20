package YouTubeTutorial

open class Mobile(val type: String)
{
    open val name: String? = null
    open val size: Int = 5
    fun makeCall() = println("Calling from mobile")
    fun powerOff() = println("Shutting down")
    open fun display() = println("Simple mobile display")
}
class OnePlus(typeP: String) : Mobile(typeP)
{
    override val name: String = "One Plus"
    override val size: Int = 6
    override fun display() = println("One Plus display")
    override fun toString(): String {
        return "Name: $name size: $size"
    }

}
fun main()
{
    val p1 = OnePlus("smartPhone")
    val s1 = Mobile("simple")
    println(p1.name)
    println(p1.size)
    p1.display()
    println(p1.toString())
}
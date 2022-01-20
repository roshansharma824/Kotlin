package IntroToKotlin

fun student(name: String="Praveen", standard: String="IX", rollNo: Int=11)
{
    println("Name of the student is: $name")
    println("Standard of the student is: $standard")
    println("Roll no of the student is: $rollNo")
}
fun main(args: Array<String>)
{
    val name = "Roshan"
    val standard = "VII"
    val roll = 25
    student(standard = standard)
}
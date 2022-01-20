package YouTubeTutorial

class Automobile(val name: String, val tyres: Int, val maxSeating: Int, val engineType: String)
{
    init{
        println("$name is created")
    }
    init {
        println("2nd Initializer Block")
    }
    constructor(name: String,engineType: String): this(name,4,5,engineType)
    {

    }
}
fun main()
{
    var car = Automobile("car","petrol")
    var car1 = Automobile("car1","petrol1")

    println(car.name)
    println(car.engineType)
    println(car1.name)
    println(car1.engineType)
}
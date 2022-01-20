package IntroToKotlin

fun main()
{
    //Array
    val numbers = arrayOf(1,2,3,4)
    val arr = intArrayOf(1,2,3,4,5)
    val arr1 = IntArray(5){it}
    println(arr1.joinToString(","))

    println("The number at the second position: ${numbers.get(1)}")
    println("The number at third position: ${numbers[2]}")
    numbers.set(3,5)
    numbers[1] = 22
    println(numbers.joinToString(","))

    val numberZero = Array(4){0}
    println(numberZero.joinToString(","))

}
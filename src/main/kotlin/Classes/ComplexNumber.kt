package Classes

import java.util.*

class ComplexNumber(var real:Int,var img:Int) {

    fun print() {
        println("$real i$img")
    }

    fun add(complex2: ComplexNumber) {
        real += complex2.real
        img += complex2.img
    }

    fun multiply(complex2: ComplexNumber) {
        var newReal:Int = real*complex2.real -(img*complex2.img)
        var newImg:Int = real*complex2.img + complex2.real*img
        real = newReal
        img = newImg
    }


    //write your code here
}

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val num1Real = read.nextInt()
    val num1Img = read.nextInt()
    val complex1 = ComplexNumber(num1Real, num1Img)

    val num2Real = read.nextInt()
    val num2Img = read.nextInt()
    val complex2 = ComplexNumber(num2Real, num2Img)

    when(read.nextInt()) {
        1 -> {
            complex1.add(complex2)
            complex1.print()
        }
        2 -> {
            complex1.multiply(complex2)
            complex1.print()
        }
    }
}
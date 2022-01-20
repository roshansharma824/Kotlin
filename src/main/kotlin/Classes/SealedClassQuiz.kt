package Classes

//sealed class Converter
//{
//    data class ConversionError(val text: String): Converter()
//    object ConvertedObj:Converter()
//}
//
//fun main()
//{
//    val data: Converter = Converter.ConversionError("Can't be parsed")
//    ConverterDisplay(data)
//}
//fun ConverterDisplay(data: Converter)
//{
//    when(data)
//    {
//        is Converter.ConversionError-> println("${data.text}")
//        is Converter.ConvertedObj-> println("Converted")
//    }
//}








//class Student(firstname:String="Rohan"){
//    val firstName:String
//    var lastName:String?=null
//    init(){
//        this.firstName=firstName
//    }
//    constructor(firstName:String, lastName:String):
//    this(firstName){
//
//        this.lastName=lastName
//
//    }
//
//    fun main(){
//
//        val student:Student= Student("Johny")
//        val student:Student= Student("Mark","Twain")
//        val student:Student= Student("Penny","Nebraska")
//
//    }
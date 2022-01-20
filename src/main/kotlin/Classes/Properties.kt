package Classes
//var <propertyName>[:<PropertyType>] [= <propert_initializer>]
// [<getter>]
// [<setter>]

//class Student{
//    val school: String = "Dp School"
//    var age: Int = 5
//
//    val isTeenager: Boolean
//        get() = age > 12
//
//    var name: String? = null
//        get() = field ?: "Unknown"
//        set(value){
//            if (value != null) field = value
//        }
//}
//fun main()
//{
//    val student:Student = Student()
//
//    println("1. Student is teenager: ${student.isTeenager}")
//    student.age = 14
//    println("2. Student is teenager: ${student.isTeenager}")
//
//    println("3. Student name is: ${student.name}")
//    student.name = "Roshan"
//    println("4. Student name is: ${student.name}")
//
//
//
//}
//
//
//
//
//
//
//
//
//
//
//
//



// Quiz 1
//class Student(){
//    var name: String? = null
//    val isInitialized : Boolean
//        get() = (name?.length ?: 0) > 0
//}
//fun main() {
//    println(Student().isInitialized)
//}

// Quiz2
//protected class Student(firstname:String="Rohan"){
//    var firstName:String
//    private var lastName:String?=null
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
//        val student1:Student= Student("Mark","Twain")
//        val student2:Student= Student("Penny","Nebraska")
//
//    }













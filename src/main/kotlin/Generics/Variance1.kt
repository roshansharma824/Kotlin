package Generics



//open class Person(val name: String)
//class Student(name: String): Person(name)
//
//fun main()
//{
//    val names: List<String> = listOf("John","Sarah","Mark")
//    val ranks: List<Int> = listOf(3,5,6)
//
//    val s1: Student = Student("John")
//    val p1: Person = s1
//
//    val student_s: MutableList<Student> = mutableListOf(Student("jack"),Student("Sarah"))
////    val person_s: MutableList<Person> = student_s
//}

//why invariant?
//open class Person(val name: String)
//class Student(name: String): Person(name)
//class Teacher(name: String): Person(name)
//
//fun add(group: MutableList<Person>, person: Person) = group.add(person)
//
//fun main()
//{
//    val student_s: MutableList<Student> = mutableListOf()
//    val teacher: Teacher = Teacher("John")
//    add(student_s,teacher)
//
//    val student: Student = student_s.get(0)
//
//}

//Quiz1
//fun main()
//{
//    val list = mutableListOf<String>("John")
//    var newList = mutableListOf<Object>()
//    newList = list
//
//}

//Quiz2
//fun main()
//{
//    val list = mutableListOf<Number>(3)
//    var newList = mutableListOf<Any>()
//    newList = list
//    println(newList)
//}

















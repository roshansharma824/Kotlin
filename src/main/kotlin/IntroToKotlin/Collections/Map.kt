package IntroToKotlin.Collections

fun main()
{
    val classRanks = mapOf(1 to "sarah", 2 to "mark", 3 to "finn" , 4 to "john")

    println("1. Students: ${classRanks.values}")

    println("2. Ranks: ${classRanks.keys}")

    println("3. Finn has got a rank: ${classRanks.containsValue("finn")}")

    println("4. The student at first Rank is ${classRanks.get(1)}")
}
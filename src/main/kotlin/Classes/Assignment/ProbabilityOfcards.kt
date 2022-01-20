package Classes.Assignment

//import java.util.*
//
//class Deck
//{
//    val cards = mutableMapOf<Int, Int>(1 to 4,2 to 4,3 to 4,4 to 4,5 to 4,6 to 4,7 to 4,8 to 4,9 to 4,10 to 4,11 to 4,12 to 4,13 to 4)
//    fun remove(card: Int, suite: Char) {
//        var n: Int? = cards[card]
//        if (n != null)
//        {
//            n = --n
//        }
//        else
//        {
//            n=0
//        }
////        n = n?.--n?:0
//
//        if (n != null)
//        {
//            cards[card] = n
//        }
//    }
//
//    fun probability(card: Int): Any? {
//        var n: Int? = cards[card]
//        var m:Int = 0
//        cards.forEach{ (k,v) ->
//            m += v
//        }
//        if (n != null)
//        {
//            n *= 1000
//        }
//        return n?.div(m)
//    }
//    //
//}
//fun main(args: Array<String>)
//{
//    val read = Scanner(System.`in`)
//    val deck = Deck()
//
//    var x: Int = read.nextInt()
//    while (x != -1)
//    {
//        when(x)
//        {
//            1->
//            {
//                val card: Int = read.nextInt()
//                val suite: Char = read.next()[0]
//                deck.remove(card, suite)
//            }
//            2->
//            {
//                val card: Int = read.nextInt()
//                println(deck.probability(card))
//            }
//        }
//        x = read.nextInt()
//    }
//}


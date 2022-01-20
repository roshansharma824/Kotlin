//import java.util.*
//
//fun main(args: Array<String>){
//    val read = Scanner(System.`in`)
//    val size = read.nextInt()
//    val count = read.nextInt()
//
//    //creates the instance of the board
//    val game = Minesweeper(size)
//    //sets mines as per the input
//    for(i in 1..count)
//        game.setMine(read.nextInt(), read.nextInt())
//
//    //iterates input ans prints output
//    val n = read.nextInt()
//    for(i in 1..n) {
//        if (game.move(read.nextInt(), read.nextInt(), read.nextInt())) {
//            println("true")
//            game.displayBoard()
//        } else {
//            println("false")
//        }
//        if(game.status!= Status.ONGOINING)
//            break
//    }
//    println(game.status)
//}
//
////board class
//class Minesweeper(private val size:Int){
//    private val board = Array(size) { Array(size) { MineCell() }}
//    var status = Status.ONGOINING
//        private set
//
//    //sets up mines
//    fun setMine(row: Int, column: Int) : Boolean{
//        if(board[row][column].value != MINE) {
//            board[row][column].value = MINE
//            updateNeighbours(row,column)
//            return true
//        }
//        return false
//    }
//
//    //updates the values os the cells neighbouring to the mines
//    private fun updateNeighbours(row: Int, column: Int) {
//        for (i in movement) {
//            for (j in movement) {
//                if(((row+i) in 0 until size) && ((column+j) in 0 until size) && board[row+i][column+j].value != MINE)
//                    board[row+i][column+j].value++
//            }
//        }
//    }
//
//    fun move(choice: Int, x: Int, y:Int): Boolean{
//        // Complete this function
//        /* Don't write main().
//         * Don't read input, it is passed as function argument.
//         * Return output and don't print it.
//         * Taking input and printing output is handled automatically.
//         */
//        when(choice)
//        {
//            1 -> {
//                if(board[x][y].isMarked || board[x][y].isRevealed)
//                {
//                    return false
//                }
//                if (board[x][y].value == MINE)
//                {
//                    status = Status.LOST
//                }
//                else
//                {
//                    reveal(x,y)
//                }
//            }
//            2 -> {
//                if (board[x][y].isRevealed)
//                    return false
//                board[x][y].isMarked = !board[x][y].isMarked
//            }
//            else ->{
//                return false
//            }
//        }
//        if (isComplete() && status != Status.LOST)
//            status = Status.WON
//        return true
//    }
//
//    private fun isComplete() : Boolean{
//        var minesMarked = true
//        board.forEach { row->
//            row.forEach {
//                if (it.value == MINE){
//                    if (!it.isMarked)
//                        minesMarked = false
//                }
//            }
//        }
//        var valuesReavealed = true
//        board.forEach { row->
//            row.forEach {
//                if (it.value != MINE){
//                    if (!it.isRevealed)
//                        valuesReavealed = false
//                }
//            }
//        }
//        return minesMarked || valuesReavealed
//    }
//
//    private fun reveal(x: Int, y:Int){
//        if (!board[x][y].isRevealed && !board[x][y].isMarked){
//            board[x][y].isRevealed = true
//            if (board[x][y].value == 0){
//                for (i in movement)
//                    for (j in movement)
//                        if ((i != 0 || j != 0) && ((x + i) in 0 until size) && ((y + j) in 0 until size))
//                            reveal(x + i, y + j)
//            }
//        }
//    }
//
//    //displays the board
//    fun displayBoard() {
//        board.forEach { row ->
//            row.forEach {
//                if(it.isRevealed)
//                    print("| ${it.value} |")
//                else if (it.isMarked)
//                    print("| X |")
//                else if (status == Status.LOST && it.value == MINE)
//                    print("| * |")
//                else if (status == Status.WON && it.value == MINE)
//                    print("| X |")
//                else
//                    print("|   |")
//            }
//            println()
//        }
//    }
//
//    companion object{
//        const val MINE = -1
//        val movement = intArrayOf(-1, 0, 1)
//    }
//}
//
////mineCell Data Class
//data class MineCell(var value:Int = 0 , var isRevealed: Boolean = false, var isMarked: Boolean = false)
//
////game status
//enum class Status{
//    WON,
//    ONGOINING,
//    LOST
//}
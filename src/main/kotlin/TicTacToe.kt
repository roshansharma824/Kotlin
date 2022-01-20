import java.util.*

fun main(args :Array<String>){
    val read = Scanner(System.`in`)

    //creates an instance of the game board as per the input size
    val game = TicTacToe(read.nextInt())

    //reads the number of moves
    val n = read.nextInt()
    for( i in 1..n) {
        if(game.move(read.nextInt(), read.nextInt())) {
            println("true")
            game.displayBoard()
            println(game.status)
        } else {
            println("false")
        }
        if(game.status != Status.ONGOINING)
            break
    }
}

//TicTacToe Board Class
class TicTacToe(private val size: Int) {
    private val board = Array(size) { Array(size) {'-'} }
    private var turn: Char = 'X'
    var status = Status.ONGOINING
        private set

    var count:Int = 0

    fun move(x: Int, y: Int) : Boolean{
        // Complete this function
        /* Don't write assignment.main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if(board[x][y] == '-')
        {
            board[x][y] = turn
            when{
                won(x,y) ->{
                    status = Status.WON
                }
                isFull() ->
                {
                    status = Status.DRAW
                }
                else ->
                {
                    toggleTurn()
                }
            }
            return true
        }
        return false
    }
    private fun isFull(): Boolean
    {
        board.forEach { row ->
            row.forEach { ch ->
                if (ch == '-')
                    return false
            }
        }
        return true
    }
    private fun won(x: Int,y: Int): Boolean
    {
        var isRow = true
        board[x].forEach { ch ->
            if (ch != turn)
                isRow = false
        }

        var isColum = true
        board.forEach { row->
            if (row[y] != turn)
                isColum = false
        }

        var isDiagonal1 = true
        for (i in 0 until size)
        {
            if (board[i][i] != turn)
                isDiagonal1 = false
        }

        var isDiagonal2 = true
        for (i in 0 until size)
        {
            if (board[i][size - i - 1] != turn)
                isDiagonal2 = false
        }
        return isRow || isColum || isDiagonal1 || isDiagonal2
    }

    fun displayBoard() {
        board.forEach {row ->
            row.forEach { ch ->
                print("| $ch |")
            }
            println()
        }
    }

    private fun toggleTurn() {
        turn = if(turn == 'X') 'O' else 'X'
    }
}

//game status
enum class Status{
    WON,
    ONGOINING,
    DRAW
}
package post6

import java.util.*

fun main(args :Array<String>){
    val read = Scanner(System.`in`)
    val player1Symbol = 1
    val player2Symbol = 2

    //creates an instance of the board
    val b = OthelloBoard()

    //reads the number of inputs
    var n: Int = read.nextInt()

    //sets P1's turn as true
    var p1Turn = true

    //computes the inputs to produce results
    while (n > 0) {
        val x: Int = read.nextInt()
        val y: Int = read.nextInt()
        var ans: Boolean
        ans = if (p1Turn) {
            b.move(player1Symbol, x, y)
        } else {
            b.move(player2Symbol, x, y)
        }
        if (ans) {
            b.print()
            p1Turn = !p1Turn
            n--
        } else {
            println(ans)
        }
    }
}

class OthelloBoard {
    private val board: Array<IntArray> = Array(8) { IntArray(8) }
    //displays the board
    fun print() {
        board.forEach { row ->
            row.forEach {
                print("$it ")
            }
            println()
        }
    }

    fun move(symbol: Int, x: Int, y: Int): Boolean {
        // Complete this function
        /* Don't write assignment.main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if(x<0 || x>=8 || y<0 || y>=8 || board[x][y]!=0)
        {
            return false
        }
        var movePossible = false
        for (i in xDir.indices)
        {
            val xStep = xDir[i]
            val yStep = yDir[i]
            var currentX = x + xStep
            var currentY = y + yStep
            var count = 0 // count of opponent's pieces encountered
            while (currentX in 0..7 && currentY in 0..7)
            {
                //Empty cell
                if (board[currentX][currentY] == 0)
                {
                    break
                }
                else if(board[currentX][currentY] != symbol)
                {
                    currentX += xStep
                    currentY += yStep
                    count++
                }
                else
                {
                    //conversion is possible
                    if (count > 0)
                    {
                        movePossible = true
                        var convertX = currentX - xStep
                        var convertY = currentY - yStep
                        while (convertX != x || convertY != y)
                        {
                            board[convertX][convertY] = symbol
                            convertX -= xStep
                            convertY -= yStep
                        }
                    }
                    break
                }
            }
        }
        if (movePossible)
        {
            board[x][y] = symbol
        }
        return movePossible
    }

    companion object {
        const val player1Symbol = 1
        const val player2Symbol = 2
        private val xDir = intArrayOf(-1, -1, 0, 1, 1, 1, 0, -1)
        private val yDir = intArrayOf(0, 1, 1, 1, 0, -1, -1, -1)
    }

    init {
        board[3][3] = player1Symbol
        board[3][4] = player2Symbol
        board[4][3] = player2Symbol
        board[4][4] = player1Symbol
    }
}
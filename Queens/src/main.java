
public class main {
    /*
    saw this clever trick to capture diagonal positions and
    row positions... decided to use it in my code
     */

    static int[] leftDiag = new int[100];
    static int[] rightDiag = new int[100];
    static int[] rowCheck = new int[100];

    // print the solution of the board //
    static void boardPrinter(int board[][], int queens) {
        for (int i = 0; i < queens; i++) {
            for (int j = 0; j < queens; j++)
                System.out.printf(" %d ", board[i][j]);
                System.out.printf("\n");
            }
        }

    static boolean solveQueens(int board[][], int col, int queens) {
        /*
        check the column number, if its more than the number of queens,
        then you have solved it
         */
        if (col >= queens)
            return true;

        /*
        as you iterate through the row (i), you check the left diagonal,
        the right diagonal, and the row you are in, if the move is valid,
        then add a "1" to your board
        */
        for (int i = 0; i < queens; i++) {
            int leftIndex = i - col + queens - 1;
            int rightIndex = i + col;

            if ((leftDiag[leftIndex] != 1 && rightDiag[rightIndex] != 1) && rowCheck[i] != 1) {
                board[i][col] = 1;
                leftDiag[leftIndex] = 1;
                rightDiag[rightIndex] = 1;
                rowCheck[i] = 1;

                if (solveQueens(board, col + 1, 8)) {
                    boardPrinter(board, 8);
                    System.out.println("\n");
                    System.exit(0);
                    return true;
                }

                /*
                if "if statement" above (left, right, row) doesnt return true,
                set the variables to "0" and start again
                 */
                board[i][col] = 0;
                leftDiag[leftIndex] = 0;
                rightDiag[rightIndex] = 0;
                rowCheck[i] = 0;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int board[][] = new int[8][8];
        int queens = 8;
        solveQueens(board, 0, 8);
    }
}




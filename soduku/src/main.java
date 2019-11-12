
public class main {

    /*
    this needs to check 3 states,
    row, column, and then box of 3x3
     */
    public static boolean isValid(int[][] board, int row, int col, int num) {
        // check row for number
        for (int d = 0; d < board.length; d++) {
            if (board[row][d] == num)
                return false;
        }

        // check column for number
        for (int r = 0; r < board.length; r++) {
            if (board[r][col] == num)
                return false;
        }

        // check the box for number
        int sqrt = 3;
        int boxRowStart = row - row % sqrt;
        int boxColStart = col - col % sqrt;

        for (int r = boxRowStart; r < boxRowStart + sqrt; r++) {
            for (int d = boxColStart; d < boxColStart + sqrt; d++) {
                if (board[r][d] == num)
                    return false;
            }
        }

        // if it passes all the checks, return true
        return true;
    }

    public static boolean sudoSolver(int[][] board, int boardLength) {
        int row = -1;
        int col = -1;
        boolean blankSpace = true;
        for (int i = 0; i < boardLength; i++) {
            for (int j = 0; j < boardLength; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;

                    blankSpace = false;
                    break;
                }
            }
            if (!blankSpace)
                break;
        }

        // if there are no "0s" left then break out //
        if (blankSpace)
            return true;

        // back track if you have "0s" left //
        for (int num = 1; num <= boardLength; num++) {
            if (isValid(board, row, col, num)) {
                board[row][col] = num;

                if (sudoSolver(board, boardLength)) {
                    boardPrinter(board, boardLength);
                    System.exit(0);
                    return true;
                } else {
                    // set the value back to 0 //
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    public static void boardPrinter(int[][] board, int boardLength) {

        System.out.print("\n");
        for (int i = 0;i < boardLength; i++) {
            for (int j = 0; j < boardLength; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String args[]) {
        int boardLength = 9;

        // found some random hard board //
        int[][] board = new int[][]
                {
                        {1, 0, 0, 0, 7, 0, 0, 3, 0},
                        {8, 3, 0, 6, 0, 0, 0, 0, 0},
                        {0, 0, 2, 9, 0, 0, 6, 0, 8},
                        {6, 0, 0, 0, 0, 4, 9, 0, 7},
                        {0, 9, 0, 0, 0, 0, 0, 5, 0},
                        {3, 0, 7, 5, 0, 0, 0, 0, 4},
                        {2, 0, 3, 0, 0, 9, 1, 0, 0},
                        {0, 0, 0, 0, 0, 2, 0, 4, 3},
                        {0, 4, 0, 0, 8, 0, 0, 0, 9}
                };

        sudoSolver(board, boardLength);

    }
}

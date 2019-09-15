import javax.lang.model.util.SimpleAnnotationValueVisitor6;
import java.util.Scanner;

public class TicTacToeDriver {
    public static void main(String[] args) {
        String[][] board = new String[3][3];
        TicTacToe thisGame = new TicTacToe(board);

        System.out.println("Do you want to play a game?");
        System.out.println("Good, lets play Tic Tac Toe");
        System.out.println("\n");
        System.out.println("Here is the game board!");
        System.out.println("\n");
        thisGame.printBoard();

        System.out.println("There will be two players, X and Y");
        System.out.println("Player X will be up first");
        System.out.println("\n");

        int count = 0;
        while(count < 9){
            thisGame.whoTurn();
            thisGame.addMove();
            thisGame.winner();
            thisGame.isWinner();
            thisGame.printBoard();
            count ++;
        }





    }
}

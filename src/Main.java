import api.GameEngine;
import boards.TicTacToeBoard;
import gamestate.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameEngine gameEngine = new GameEngine();
        TicTacToeBoard board = (TicTacToeBoard) gameEngine.start("TicTacToe");

        while(!gameEngine.isComplete(board).isOver()){
            System.out.println(board);
            System.out.println("Make Your Move");
            Player computer = new Player("O"), opponent = new Player("X");
            int row = scanner.nextInt(), col=scanner.nextInt();
            Move oppMove = new Move(new Cell(row, col), opponent);
            gameEngine.move(board, opponent, oppMove);
            System.out.println(board);
            if(!gameEngine.isComplete(board).isOver()) {
                Move computerMove = gameEngine.suggestMove(computer, board);
                gameEngine.move(board, computer, computerMove);
            }
        }
        System.out.println("Game Result: "+ gameEngine.isComplete(board));
    }
}
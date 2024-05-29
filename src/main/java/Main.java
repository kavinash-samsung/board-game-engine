package main.java;

import main.java.api.AIEngine;
import main.java.api.GameEngine;
import main.java.boards.TicTacToeBoard;
import main.java.gamestate.Player;
import main.java.api.RuleEngine;

import main.java.gamestate.Cell;
import main.java.gamestate.Move;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameEngine gameEngine = new GameEngine();
        AIEngine aiEngine = new AIEngine();
        RuleEngine ruleEngine = new RuleEngine();
        TicTacToeBoard board = (TicTacToeBoard) gameEngine.start("TicTacToe");

        while(!ruleEngine.getState(board).isOver()){
            System.out.println(board);
            System.out.println("Make Your Move");
            Player computer = new Player("O"), opponent = new Player("X");
            int row = scanner.nextInt(), col=scanner.nextInt();
            Move oppMove = new Move(new Cell(row, col), opponent);
            gameEngine.move(board, oppMove);
            System.out.println(board);
            if(!ruleEngine.getState(board).isOver()) {
                Move computerMove = aiEngine.suggestMove(computer, board);
                gameEngine.move(board, computerMove);
            }
        }
        System.out.println("Game Result: "+ ruleEngine.getState(board));
    }
}
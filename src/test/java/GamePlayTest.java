package test.java;

import main.java.api.AIEngine;
import main.java.api.GameEngine;
import main.java.api.RuleEngine;
import main.java.boards.TicTacToeBoard;
import main.java.gamestate.Board;
import main.java.gamestate.Cell;
import main.java.gamestate.Move;
import main.java.gamestate.Player;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GamePlayTest {
    GameEngine gameEngine;
    AIEngine aiEngine;
    RuleEngine ruleEngine;
    @Before
    public void setup() {
        gameEngine = new GameEngine();
        aiEngine = new AIEngine();
        ruleEngine = new RuleEngine();
    }

    @Test
    public void checkForRowWin(){
        Board board = gameEngine.start("TicTacToe");
        int row = 0, col=0;
        int next = 0;
        int[][] moves = {{1, 0}, {1, 1}, {1, 2}};
        while(!ruleEngine.getState(board).isOver()){
            System.out.println(board);
            System.out.println("Make Your Move");
            Player computer = new Player("O"), opponent = new Player("X");
            row = moves[next][0];
            col=moves[next][1];
            next++;
            Move oppMove = new Move(new Cell(row, col), opponent);
            gameEngine.move(board, oppMove);
            System.out.println(board);
            if(!ruleEngine.getState(board).isOver()) {
                Move computerMove = aiEngine.suggestMove(computer, board);
                gameEngine.move(board, computerMove);
            }
        }
        Assert.assertTrue(ruleEngine.getState(board).isOver());
        Assert.assertEquals(ruleEngine.getState(board).getWinner(), "X");
    }

    @Test
    public void checkForColWin(){
        Board board = gameEngine.start("TicTacToe");
        int row = 0, col=0;
        int next = 0;
        int[][] moves = {{0, 0}, {1, 0}, {2, 0}};
        while(!ruleEngine.getState(board).isOver()){
            System.out.println(board);
            System.out.println("Make Your Move");
            Player computer = new Player("O"), opponent = new Player("X");
            row = moves[next][0];
            col=moves[next][1];
            next++;
            Move oppMove = new Move(new Cell(row, col), opponent);
            gameEngine.move(board, oppMove);
            System.out.println(board);
            if(!ruleEngine.getState(board).isOver()) {
                Move computerMove = aiEngine.suggestMove(computer, board);
                gameEngine.move(board, computerMove);
            }
        }
        Assert.assertTrue(ruleEngine.getState(board).isOver());
        Assert.assertEquals(ruleEngine.getState(board).getWinner(), "X");
    }

    @Test
    public void checkForDiagWin(){
        Board board = gameEngine.start("TicTacToe");
        int row = 0, col=0;
        int next = 0;
        int[][] moves = {{0, 0}, {1, 1}, {2, 2}};
        while(!ruleEngine.getState(board).isOver()){
            System.out.println(board);
            System.out.println("Make Your Move");
            Player computer = new Player("O"), opponent = new Player("X");
            row = moves[next][0];
            col=moves[next][1];
            next++;
            Move oppMove = new Move(new Cell(row, col), opponent);
            gameEngine.move(board, oppMove);
            System.out.println(board);
            if(!ruleEngine.getState(board).isOver()) {
                Move computerMove = aiEngine.suggestMove(computer, board);
                gameEngine.move(board, computerMove);
            }
        }
        Assert.assertTrue(ruleEngine.getState(board).isOver());
        Assert.assertEquals(ruleEngine.getState(board).getWinner(), "X");
    }

    @Test
    public void checkForRevDiagWin(){
        Board board = gameEngine.start("TicTacToe");
        int row = 0, col=0;
        int next = 0;
        int[][] moves = {{0, 2}, {1, 1}, {2, 0}};
        while(!ruleEngine.getState(board).isOver()){
            System.out.println(board);
            System.out.println("Make Your Move");
            Player computer = new Player("O"), opponent = new Player("X");
            row = moves[next][0];
            col=moves[next][1];
            next++;
            Move oppMove = new Move(new Cell(row, col), opponent);
            gameEngine.move(board, oppMove);
            System.out.println(board);
            if(!ruleEngine.getState(board).isOver()) {
                Move computerMove = aiEngine.suggestMove(computer, board);
                gameEngine.move(board, computerMove);
            }
        }
        Assert.assertTrue(ruleEngine.getState(board).isOver());
        Assert.assertEquals(ruleEngine.getState(board).getWinner(), "X");
    }
    @Test
    public void checkForComputerWin(){
        Board board = gameEngine.start("TicTacToe");
        int row = 0, col=0;
        int next = 0;
        int[][] moves = {{1, 2}, {1, 1}, {2, 0}};
        while(!ruleEngine.getState(board).isOver()){
            System.out.println(board);
            System.out.println("Make Your Move");
            Player computer = new Player("O"), opponent = new Player("X");
            row = moves[next][0];
            col=moves[next][1];
            next++;
            Move oppMove = new Move(new Cell(row, col), opponent);
            gameEngine.move(board, oppMove);
            System.out.println(board);
            if(!ruleEngine.getState(board).isOver()) {
                Move computerMove = aiEngine.suggestMove(computer, board);
                gameEngine.move(board, computerMove);
            }
        }
        Assert.assertTrue(ruleEngine.getState(board).isOver());
        Assert.assertEquals(ruleEngine.getState(board).getWinner(), "O");
    }
}

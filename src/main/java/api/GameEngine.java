package main.java.api;

import main.java.boards.TicTacToeBoard;
import main.java.gamestate.Board;
import main.java.gamestate.Move;

import java.lang.*;

public class GameEngine{
    public Board start(String boardType){
        if(boardType.equals("TicTacToe")) {
            return new TicTacToeBoard();
        }else{
            throw new IllegalArgumentException();
        }
    }
    public void move(Board board, Move move){
        if(board instanceof TicTacToeBoard){
            board.move(move);
        }else{
            throw new IllegalArgumentException();
        }
    }
}

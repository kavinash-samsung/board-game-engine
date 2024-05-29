package main.java.api;

import main.java.boards.TicTacToeBoard;
import main.java.gamestate.GameState;
import main.java.gamestate.Board;

public class RuleEngine {
    public GameState getState(Board board){
        if(board instanceof TicTacToeBoard){
            TicTacToeBoard board1 = (TicTacToeBoard) board;
            boolean rowComplete=true;
            String firstCharacter = "-";
            for(int i=0;i<3;i++){
                rowComplete = true;
                firstCharacter = board1.getCell(i, 0);
                if(firstCharacter == null){
                    rowComplete = false;
                }
                if(firstCharacter != null){
                    for(int j=0;j<3;j++){
                        if(!firstCharacter.equals(board1.getCell(i, j))){
                            rowComplete = false;
                            break;
                        }
                    }
                }
                if(rowComplete == true){
                    break;
                }
            }
            if(rowComplete){
                return new GameState(true, firstCharacter);
            }

            boolean colComplete=true;
            for(int i=0;i<3;i++){
                colComplete = true;
                firstCharacter = board1.getCell(0, i);
                if(firstCharacter == null){
                    colComplete = false;
                }
                if(firstCharacter != null){
                    for(int j=1;j<3;j++){
                        if(!firstCharacter.equals(board1.getCell(j, i))){
                            colComplete = false;
                            break;
                        }
                    }
                }
                if(colComplete == true){
                    break;
                }
            }
            if(colComplete){
                return new GameState(true, firstCharacter);
            }

            boolean diagComplete=true;
            for(int i=0;i<3;i++){
                diagComplete = true;
                firstCharacter = board1.getCell(0, 0);
                if(firstCharacter == null){
                    diagComplete = false;
                    break;
                }
                if(!firstCharacter.equals(board1.getCell(i, i))){
                    diagComplete = false;
                    break;
                }
            }
            if(diagComplete){
                return new GameState(true, firstCharacter);
            }

            boolean revDiagComplete=true;
            for(int i=0;i<3;i++){
                revDiagComplete = true;
                firstCharacter = board1.getCell(0, 2);
                if(firstCharacter == null){
                    revDiagComplete = false;
                    break;
                }
                if(!firstCharacter.equals(board1.getCell(i, 2-i))){
                    revDiagComplete = false;
                    break;
                }
            }
            if(revDiagComplete){
                return new GameState(true, firstCharacter);
            }
            int countFilledCells = 0;
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(board1.getCell(i, j) != null){
                        countFilledCells++;
                    }
                }
            }
            if(countFilledCells != 9){
                return new GameState(false, "-");
            }else{
                return new GameState(true, "-");
            }
        }
        else{
            throw new IllegalArgumentException();
        }
    }
}

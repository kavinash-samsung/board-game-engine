package boards;

import gamestate.*;

public class TicTacToeBoard extends Board {
    String cells[][] = new String[3][3];
    public String getCell(int x, int y){
        return cells[x][y];
    }
    public void setCell(Cell cell, String symbol){
        cells[cell.getRow()][cell.getCol()] = symbol;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                String symbol = (cells[i][j] == null)?"_":cells[i][j];
                sb.append(symbol).append(" ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}

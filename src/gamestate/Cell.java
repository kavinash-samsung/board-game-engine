package gamestate;

public class Cell {
    int row;
    int col;
    String symbol;
    public Cell(int row, int col){
        this.row = row;
        this.col = col;
        this.symbol = symbol;
    }
    public int getRow(){
        return row;
    }
    public int getCol(){
        return col;
    }
}

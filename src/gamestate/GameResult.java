package gamestate;

public class GameResult{
    boolean isOver;
    String winner;
    public GameResult(boolean isOver, String winner){
        this.isOver = isOver;
        this.winner = winner;
    }

    public String toString(){
        return "Is over "+ this.isOver+ " winner is "+ this.winner;
    }
    public boolean isOver(){
        return isOver;
    }

    public String getWinner(){
        return winner;
    }
}

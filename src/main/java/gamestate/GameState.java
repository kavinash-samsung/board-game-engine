package main.java.gamestate;

public class GameState {
    boolean isOver;
    String winner;
    public GameState(boolean isOver, String winner){
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

import java.util.*;

public class Player {

    private String name;
    private int points;
    private ArrayList<Die> listOfDices;

    public Player(String name, int points, ArrayList<Die> listOfDices){
                this.name = name;
                this.points = points;
                this.listOfDices = listOfDices;
    }


    public void rollDice(){
        //roll all dices in the players list.
    }

    public int getDieValue(){
        //
        return  0;
    }
    public void increaseScore(){
        //increase score by 1
    }
    public void addDie(int sides){
        //create a new dice and add it to the player.
    }
    public String toString(){
        return "Player: " + this.name + ": -- " + this.points + "p -- ";
    }
}

import java.util.*;

public class Player {

    private String name;
    private int points;
    private ArrayList<Die> listOfDices;

    public Player(String name) {
        this.name = name;
        this.points = 0;
        this.listOfDices = new ArrayList<>();
    }


    public void rollDice() {

        for (Die die : this.listOfDices) {
            //roll the dices
            die.roll();
            //
        }

    }

    public int getDieValue() {
        int sum = 0;
        for (Die die : listOfDices){
            sum += die.getCurrentValue();
        }
        return sum;
    }

    public void increaseScore() {
        //increase score by 1
        this.points++;
    }

    public void addDie(int sides) {
        listOfDices.add(new Die(0, sides));
    }
    public int getPoints(){
        return this.points;
    }
    public String getName(){
        return this.name;
    }

    public String toString() {
        return "Player: " + this.name + ": -- " + this.points + "p -- ";
    }
}

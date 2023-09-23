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

        Scanner scanner = new Scanner(System.in);

        int whatThePlayerGuessed;

        for (Die die : this.listOfDices) {
            //ask user what the number will be
            System.out.println("guess");
            whatThePlayerGuessed = Integer.parseInt(scanner.nextLine());
            //roll the dices
            die.roll();
            int sumOfAllDices = getDieValue();
            //check if the number is the same as guessed
            System.out.println(getDieValue());
            if (sumOfAllDices == whatThePlayerGuessed) {
                System.out.println("ok du gissa rätt");
            }
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

    public String toString() {
        return "Player: " + this.name + ": -- " + this.points + "p -- ";
    }
}

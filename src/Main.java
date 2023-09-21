//Spelet kommer sedan att spelas i fem omgångar.
//Varje omgång består av att spelarna, en efter en, gissar på ett värde och sedan rullar sina tärningar.
//Om värdet spelaren gissade på är lika med det sammanlagda värdet på tärningarna, så får spelaren en poäng.
//En omgång är slut då en sista spelaren har gissat och rullat sina tärningar.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Start game
        initialize();

    }
    private static ArrayList<Player> initialize(){
        // Call this method in main to start up the game.

        //Create a new instance of arraylist to store all the players.
        ArrayList<Player> listOfPlayers = new ArrayList<>();

        //Create a new instance of arraylist to store all their dices
        ArrayList<Die> listOfDices = new ArrayList<>();

        //Create a scanner to get some stuff from the players
        Scanner scanner = new Scanner(System.in);

        //ask questions
        System.out.println("How many players?");
        int numberOfPlayers = Integer.parseInt(scanner.nextLine());
        System.out.println("How many dices?");
        int numberOfDicesPerPlayer = Integer.parseInt(scanner.nextLine());
        System.out.println("How many sides?");
        int numberOfSidesOnDice = Integer.parseInt(scanner.nextLine());
        scanner.close();

        //Create list of dices per person.
        for (int j = 0; j < numberOfDicesPerPlayer; j++){
            Die die = new Die(0, numberOfSidesOnDice);
            listOfDices.add(j, die);
        }

        //Connect the number of dices per list to the player list
        for (int i = 0; i < numberOfPlayers; i++){

            Player player = new Player("Player " + i, 0, listOfDices);
            listOfPlayers.add(i, player);
        }

//        System.out.println(listOfPlayers);
//        System.out.println(listOfDices);
        return listOfPlayers;
    }
    private static void takeTurn(ArrayList<Player> players){

    }
    private static ArrayList<Player> getWinners(ArrayList<Player> players){

        ArrayList<Player> scoreboard = new ArrayList<>();

        return scoreboard;
    }
}
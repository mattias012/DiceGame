//Spelet kommer sedan att spelas i fem omgångar.
//Varje omgång består av att spelarna, en efter en, gissar på ett värde och sedan rullar sina tärningar.
//Om värdet spelaren gissade på är lika med det sammanlagda värdet på tärningarna, så får spelaren en poäng.
//En omgång är slut då en sista spelaren har gissat och rullat sina tärningar.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Define number of turns in the game
        final int NUMBER_OF_TURNS = 5;

        //Start game
        ArrayList<Player> listOfPlayers = initialize();

        //Play the game
        takeTurn(listOfPlayers, NUMBER_OF_TURNS);

        //Display Scoreboard
        getWinners(listOfPlayers);
        int pos = 1;
        for (Player player : listOfPlayers) {
            if (pos == 1){
                System.out.println(pos + ". ### " + player.getName() + " " + player.getPoints() + "p ###");
            }
            else {
                System.out.println(pos + ". " + player.getName() + " " + player.getPoints() + "p");
            }
            pos++;
        }
    }

    private static ArrayList<Player> initialize() {
        // Call this method in main to start up the game.

        //Create a new instance of arraylist to store all the players.
        ArrayList<Player> listOfPlayers = new ArrayList<>();

        //Create a scanner to get some stuff from the players
        Scanner scanner = new Scanner(System.in);

        //ask questions
        System.out.println("How many players?");
        int numberOfPlayers = Integer.parseInt(scanner.nextLine());
        System.out.println("How many dices?");
        int numberOfDicesPerPlayer = Integer.parseInt(scanner.nextLine());
        System.out.println("How many sides?");
        int numberOfSidesOnDice = Integer.parseInt(scanner.nextLine());

        //Connect the number of dices per list to the player list
        for (int i = 0; i < numberOfPlayers; i++) {

            System.out.println("What is the name of player " + (i + 1) + "?");
            String name = scanner.nextLine();
            Player player = new Player(name);

            //Add a new dice as requested
            for (int j = 0; j < numberOfDicesPerPlayer; j++) {

                player.addDie(numberOfSidesOnDice);
            }

            //Store players in the list.
            listOfPlayers.add(i, player);
        }

        return listOfPlayers;
    }

    private static void takeTurn(ArrayList<Player> players, int NUMBER_OF_TURNS) {

        //Just to print which turn it is.
        int turn[] = {1, 2, 3, 4, 5};

        //Loop each player 5 times. Loop inside loop because we want all players to participate in each turn
        //Then we restart the for i loop to take next turn.
        for (int i = 0; i < NUMBER_OF_TURNS; i++) {
            for (Player player : players) {

                //Each player rolls all their dices.
                player.rollDice();
                //Store the sum of each roll in this variable.
                int sumOfAllDices = player.getDieValue();

                //Lets see what the user guessed
                Scanner scanner = new Scanner(System.in);
                int whatThePlayerGuessed;

                //ask user what the number will be
                System.out.println("Turn " + (turn[i]) + ". Guess the sum of the dices " + player.getName() + "?");
                whatThePlayerGuessed = Integer.parseInt(scanner.nextLine());

                //check if the number is the same as guessed
                System.out.println(sumOfAllDices);

                if (sumOfAllDices == whatThePlayerGuessed) {
                    System.out.println("Correct! Points to you");
                    player.increaseScore(); //increase this players score
                } else {
                    System.out.println("Wrong guess! Better luck next time.");
                }
            }
        }
    }

    private static ArrayList<Player> getWinners(ArrayList<Player> players) {

        //Do not really understand this part yet.
        Comparator<Player> comparePoints = (player1, player2) -> player2.getPoints() - player1.getPoints();
        Collections.sort(players, comparePoints);

        return players;
    }
}
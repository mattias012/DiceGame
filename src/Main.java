//Spelet kommer sedan att spelas i fem omgångar.
//Varje omgång består av att spelarna, en efter en, gissar på ett värde och sedan rullar sina tärningar.
//Om värdet spelaren gissade på är lika med det sammanlagda värdet på tärningarna, så får spelaren en poäng.
//En omgång är slut då en sista spelaren har gissat och rullat sina tärningar.

public class Main {
    public static void main(String[] args) {
        Die die = new Die(1, 6);

        die.roll();

        System.out.println(die.toString());

    }
}
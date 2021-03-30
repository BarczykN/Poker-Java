package Game;

import Card.Deck;

import java.util.Scanner;

public class NumberOfPlayers {


    public int NumberofPlayers(){
        int number = 0;
        Scanner userInput = new Scanner(System.in);

        System.out.println("How many players,want to play?(max 5): ");
        number = userInput.nextInt();


        return number;
    }
}

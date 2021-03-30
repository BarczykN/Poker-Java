package Game;

import Card.Deck;
import Winner.*;

import java.math.RoundingMode;
import java.sql.SQLOutput;

public class Poker {

    static Deck dealerDeck = new Deck();
    static Deck playingDeck = new Deck();
    static int point = 0;
    static boolean special = true;
    static String wh = " ";
    static int moneyOT = 0;

    public static void main(String[] args) {

        //define objects
        PlayerMove playerMove = new PlayerMove();
        NumberOfPlayers numberOfPlayers = new NumberOfPlayers();
        //define objects to check who is the winner
        RoyalFlush royalFlush = new RoyalFlush();
        StraightFlush straightFlush = new StraightFlush();
        Quads quads = new Quads();
        FullHouse fullHouse = new FullHouse();
        Flush flush = new Flush();
        Straight straight = new Straight();
        ThreeOfKind threeOfKind = new ThreeOfKind();
        TwoPair twoPair = new TwoPair();
        Pair pair = new Pair();
        HighCard highCard = new HighCard();

        int numberOfPlayersInt = 0;
        int highestBid = 0;

        //define checking classes



        //creating out playingDeck

        playingDeck.createFullDeck();
        playingDeck.shuffle();

        Deck playerDeck = new Deck();


        numberOfPlayersInt = numberOfPlayers.NumberofPlayers();
        int playerMoney[] = new int[numberOfPlayersInt];
        int playerInput[] = new int[numberOfPlayersInt];
        int playerActualBid[] = new int[numberOfPlayersInt];
        int playerPoints[] = new int[numberOfPlayersInt];
        boolean playerSpecial[] = new boolean[numberOfPlayersInt];
        String playerWH[] = new String[numberOfPlayersInt];

        boolean folded []= new boolean[numberOfPlayersInt];

        for(int i = 0;i<numberOfPlayersInt;i++){
            folded[i] = false;
        }

        for(int i = 0;i<numberOfPlayersInt;i++){
            int money = 500;
            playerMoney[i] = money;
        }

        for(int i = 0;i<numberOfPlayersInt;i++){
            System.out.println("player "+(i+1)+" money: "+playerMoney[i]+"$");
        }

        for(int i = 0;i<numberOfPlayersInt;i++){
            playerPoints[i] = 0;
        }

        for(int i = 0;i<numberOfPlayersInt;i++){
            playerSpecial[i] = true;
        }


        Deck playersDeck[] = new Deck[numberOfPlayersInt];
        Deck computersDeck[] = new Deck[5 - numberOfPlayersInt];



        //initializing players deck
        for(int i = 0;i<playersDeck.length;i++){
            playersDeck[i] = new Deck();
        }

        //initializing computers deck
        for(int i = 0;i<computersDeck.length;i++){
            computersDeck[i] = new Deck();
        }

        //creating players deck
        for(int i = 0;i<numberOfPlayersInt;i++){
            playersDeck[i].draw(playingDeck);
            playersDeck[i].draw(playingDeck);

        }

        //creating computer deck
        int number = 5 - numberOfPlayersInt;
        if(number != 0){
            for(int i = 0;i<number;i++){
                computersDeck[i].draw(playingDeck);
                computersDeck[i].draw(playingDeck);
            }
        }


        for(int i = 0;i<number;i++){
            System.out.println("computer "+(i+1)+"deck is " + computersDeck[i].toString());
        }




        //round one
        System.out.println("*********ROUND ONE********");
            for(int i = 0;i<numberOfPlayersInt;i++){
                System.out.println("player "+(i+1)+"deck is " + playersDeck[i].toString());
                playerInput[i] = playerMove.playerMove(i+1,playerMoney[i],highestBid);

                if(playerInput[i] > highestBid){
                    highestBid = playerInput[i];
                }
                if(playerInput[i] == -1){
                    System.out.println("Player nr "+(i+1)+" folded");
                    folded[i] = true;
                }
                else {
                    playerMoney[i] = playerMoney[i] - playerInput[i];
                    System.out.println("player "+(i+1)+" money: "+playerMoney[i]);
                }

            }

            Draw(3);

        System.out.println("Dealer deck is: "+dealerDeck.toString());

        //round two
        System.out.println("*******ROUND TWO*********");
        for(int i = 0;i<numberOfPlayersInt;i++){
            if(folded[i] == false) {
                System.out.println("player " + (i + 1) + "deck is " + playersDeck[i].toString());
                playerInput[i] = playerMove.playerMove(i + 1, playerMoney[i], highestBid);

                if (playerInput[i] > highestBid) {
                    highestBid = playerInput[i];
                }
                if (playerInput[i] == -1) {
                    System.out.println("Player nr " + (i + 1) + " folded");
                    folded[i] = true;
                } else {
                    playerMoney[i] = playerMoney[i] - playerInput[i];
                    System.out.println("player " + (i + 1) + " money: " + playerMoney[i]);
                }
            }
        }
        Draw(1);

        System.out.println("Dealer deck is: "+dealerDeck.toString());

        //round three
        System.out.println("********ROUND THREE********");
        for(int i = 0;i<numberOfPlayersInt;i++){
            if(folded[i] == false) {
                System.out.println("player " + (i + 1) + "deck is " + playersDeck[i].toString());
                playerInput[i] = playerMove.playerMove(i + 1, playerMoney[i], highestBid);

                if (playerInput[i] > highestBid) {
                    highestBid = playerInput[i];
                }
                if (playerInput[i] == -1) {
                    System.out.println("Player nr " + (i + 1) + " folded");
                    folded[i] = true;
                } else {
                    playerMoney[i] = playerMoney[i] - playerInput[i];
                    System.out.println("player " + (i + 1) + " money: " + playerMoney[i]);
                }
            }
        }
        Draw(1);

        System.out.println("Dealer deck is: "+dealerDeck.toString());
       // System.out.println("Dealer deck size is "+dealerDeck.deckSize());

        System.out.println("Money on table = "+moneyOT);


        int Winner_id = 0;

        //TODO add winner checking,check every possibility and give them boolean state,then count the points and get the winner
        //TODO who got the highest score

        for(int i = 0;i<numberOfPlayersInt;i++) {
            royalFlush.isRoyalFlush(playersDeck[i], dealerDeck);
            playerSpecial[i] = special;
            System.out.println("Player "+(i+1)+" have special = "+playerSpecial[i]);
            special = true;
            if(playerSpecial[i] == false){
                highCard.highCard(playersDeck[i]);
            }
            playerWH[i] = wh;
            playerPoints[i] = point;
            point = 0;

            System.out.println("Player "+(i+1)+" points = "+playerPoints[i]);
            System.out.println("Player "+(i+1)+" have "+playerWH[i]);

         //   System.out.println("Dealer deck after one loop is "+dealerDeck.toString());
            dealerDeck.removeCard(6);
            dealerDeck.removeCard(5);
        //    System.out.println("Dealer deck after removing player cards is "+dealerDeck.toString());

        }



        //TODO add winner checking,check every possibility and give them boolean state,then count the points and get the winner
        //TODO who got the highest score



        int winnerid = 0;
        int highscore = 0;
        int secondWinnerid = 0;
        boolean twoWinners = false;

        for(int i = 0;i<numberOfPlayersInt;i++){
            if(highscore < playerPoints[i]){
                winnerid = i;
                highscore = playerPoints[i];
            }
            else if(highscore == playerPoints[i]){

                highCard.highCard(playersDeck[winnerid]);
                playerPoints[winnerid] = playerPoints[winnerid] + point;
                System.out.println("Player "+(winnerid + 1)+" points "+playerPoints[winnerid]);
                highCard.highCard(playersDeck[i]);
                playerPoints[i] = playerPoints[i] + point;
                System.out.println("Player "+(i+1)+" points "+playerPoints[i]);

                if(playerPoints[i] > playerPoints[winnerid]){
                    winnerid = i;
                    highscore = playerPoints[i];
                }
                else if(playerPoints[i] == playerPoints[winnerid]){
                    twoWinners = true;
                    secondWinnerid = i;
                }
            }
        }

        if(twoWinners == false) {
            System.out.println("Winner is player number " + (winnerid + 1) + " with score " + playerPoints[winnerid]);
        }
        else if(twoWinners){
            System.out.println("Two winners,player "+(winnerid + 1)+" and player "+(secondWinnerid + 1));
        }


        moneyOT = 0;

    }

    public static void Draw(int n){
        for(int i = 0;i<n;i++){
            dealerDeck.draw(playingDeck);
        }
    }


    public static void PlayerPoints(int points){
        point = points;
    }

    public static void isSpecial(boolean isspecial){
        special = isspecial;
        System.out.println("In func isSpecial, special = "+special);
    }

    public static void setwhatHave(String wH){
        wh = wH;
    }

    public static void setMoneyOnTable(int moneyOnTable){moneyOT = moneyOT + moneyOnTable;}



}




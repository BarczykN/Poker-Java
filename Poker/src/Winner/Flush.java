package Winner;

import Card.Deck;
import Game.Poker;

public class Flush {

    public void isFlush(Deck dealerDeck){

        Poker poker = new Poker();
        Straight straight = new Straight();

        int spade = 0,diamond = 0,club=0,heart=0;
        boolean isFlush = false;

        for(int i = 0;i<7;i++){
            switch (dealerDeck.getCard(i).getSuit()){
                case DIAMOND:
                    diamond++;
                    if(diamond == 5){
                        isFlush=true;
                    }
                    break;
                case SPADE:
                    spade++;
                    if(spade == 5){
                        isFlush=true;
                    }
                    break;
                case HEART:
                    heart++;
                    if(heart == 5){
                        isFlush=true;
                    }
                    break;
                case CLUB:
                    club++;
                    if(club == 5){
                        isFlush=true;
                    }
                    break;
            }
        }

        if(isFlush){
            System.out.println("is flush");
            poker.setwhatHave("flush");
            poker.PlayerPoints(600);
        }
        else{
            System.out.println("no flush");
            straight.isStraight(dealerDeck);
        }

    }
}

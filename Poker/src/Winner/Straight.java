package Winner;

import Card.Deck;
import Game.Poker;

public class Straight {

    public void isStraight(Deck dealerDeck){
        ThreeOfKind threeOfKind = new ThreeOfKind();
        Poker poker = new Poker();


        int aces=0,kings=0,queens=0,jacks=0,tens=0,nines=0,eights=0,sevens=0,sixs=0,fives=0,fours=0,threes=0,twos=0;

        for(int i = 0;i<7;i++){
            switch (dealerDeck.getCard(i).getValue()){
                case ACE:
                    aces++;
                    break;
                case KING:
                    kings++;
                    break;
                case QUEEN:
                    queens++;
                    break;
                case JACK:
                    jacks++;
                    break;
                case TEN:
                    tens++;
                    break;
                case NINE:
                    nines++;
                    break;
                case EIGHT:
                    eights++;
                    break;
                case SEVEN:
                    sevens++;
                    break;
                case SIX:
                    sixs++;
                    break;
                case FIVE:
                    fives++;
                    break;
                case FOUR:
                    fours++;
                    break;
                case THREE:
                    threes++;
                    break;
                case TWO:
                    twos++;
                    break;
            }
        }

        if((aces >= 1 && twos>=1&&threes>1&&fours>=1&&fives>=1)||
                (twos>=1&&threes>1&&fours>=1&&fives>=1&&sixs>=1)||
                (threes>1&&fours>=1&&fives>=1&&sixs>=1&&sevens>=1)||
                (fours>=1&&fives>=1&&sixs>=1&&sevens>=1&&eights>=1)||
                (fives>=1&&sixs>=1&&sevens>=1&&eights>=1&&nines>=1)||
                (sixs>=1&&sevens>=1&&eights>=1&&nines>=1&&tens>=1)||
                (sevens>=1&&eights>=1&&nines>=1&&tens>=1&&jacks>=1)||
                (eights>=1&&nines>=1&&tens>=1&&jacks>=1&queens>=1)||
                (nines>=1&&tens>=1&&jacks>=1&queens>=1&&kings>=1)||
                (tens>=1&&jacks>=1&queens>=1&&kings>=1&&aces>=1)){
            System.out.println("is Straight");
            poker.setwhatHave("straight");
            poker.PlayerPoints(500);
        }
        else {
            threeOfKind.isThreeOfKind(dealerDeck);
        }
    }
}

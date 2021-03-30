package Winner;

import Card.Deck;
import Game.Poker;

public class ThreeOfKind {

    public void isThreeOfKind(Deck dealerDeck){
        Poker poker = new Poker();
        TwoPair twoPair = new TwoPair();

        int aces=0,kings=0,queens=0,jacks=0,tens=0,nines=0,eights=0,sevens=0,sixs=0,fives=0,fours=0,threes=0,twos=0;
        boolean isThree = false;
        int points = 0;

        //checkin three
        for(int i = 0;i<7;i++){
            switch (dealerDeck.getCard(i).getValue()){
                case ACE:
                    aces++;
                    if(aces == 3){
                        points = 500;
                        isThree = true;
                    }
                    break;
                case KING:
                    kings++;
                    if(kings == 3){
                        points = 480;
                        isThree = true;
                    }
                    break;
                case QUEEN:
                    queens++;
                    if(queens == 3){
                        points = 460;
                        isThree = true;
                    }
                    break;
                case JACK:
                    jacks++;
                    if(jacks == 3){
                        points = 440;
                        isThree = true;
                    }
                    break;
                case TEN:
                    tens++;
                    if(tens == 3){
                        points = 420;
                        isThree = true;
                    }
                    break;
                case NINE:
                    nines++;
                    if(nines == 3){
                        points = 400;
                        isThree = true;
                    }
                    break;
                case EIGHT:
                    eights++;
                    if(eights == 3){
                        points = 380;
                        isThree = true;
                    }
                    break;
                case SEVEN:
                    sevens++;
                    if(sevens == 3){
                        points = 360;
                        isThree = true;
                    }
                    break;
                case SIX:
                    sixs++;
                    if(sixs == 3){
                        points = 340;
                        isThree = true;
                    }
                    break;
                case FIVE:
                    fives++;
                    if(fives == 3){
                        points = 320;
                        isThree = true;
                    }
                    break;
                case FOUR:
                    fours++;
                    if(fours == 3){
                        points = 300;
                        isThree = true;
                    }
                    break;
                case THREE:
                    threes++;
                    if(threes == 3){
                        points = 280;
                        isThree = true;
                    }
                    break;
                case TWO:
                    twos++;
                    if(twos == 3){
                        points = 260;
                        isThree = true;
                    }
                    break;
            }
        }

        if(isThree){
            System.out.println("is three");
            poker.setwhatHave("three of kind");
            poker.PlayerPoints(400);
        }
        else{
            System.out.println("no three");
            twoPair.isTwoPair(dealerDeck);
        }
    }
}

package Winner;

import Card.Deck;
import Game.Poker;

public class TwoPair {

    public void isTwoPair(Deck dealerDeck){
        Poker poker = new Poker();
        OnePair onePair = new OnePair();

        int aces=0,kings=0,queens=0,jacks=0,tens=0,nines=0,eights=0,sevens=0,sixs=0,fives=0,fours=0,threes=0,twos=0;
        int numberOfPars = 0;
        boolean isPar = false,isPar2 = false;
        int points = 0;

        for(int i = 0;i<7;i++){
            switch (dealerDeck.getCard(i).getValue()){
                case ACE:
                    aces++;
                    if(aces == 2){
                        aces = 3;
                        points = points + 14;
                       numberOfPars++;
                    }
                    break;
                case KING:
                    kings++;
                    if(kings == 2){
                        kings = 3;
                        points = points + 13;
                        numberOfPars++;
                    }
                    break;
                case QUEEN:
                    queens++;
                    if(queens == 2){
                        queens = 3;
                        points = points + 12;
                        numberOfPars++;

                    }
                    break;
                case JACK:
                    jacks++;
                    if(jacks == 2){
                        jacks = 3;
                        points = points + 11;
                        numberOfPars++;
                        isPar = true;
                    }
                    break;
                case TEN:
                    tens++;
                    if(tens == 2){
                        tens = 3;
                        points = points + 10;
                        numberOfPars++;
                        isPar = true;
                    }
                    break;
                case NINE:
                    nines++;
                    if(nines == 2){
                        nines = 3;
                        points = points + 9;
                        numberOfPars++;
                        isPar = true;
                    }
                    break;
                case EIGHT:
                    eights++;
                    if(eights == 2){
                        eights = 3;
                        points = points + 8;
                        numberOfPars++;
                        isPar = true;
                    }
                    break;
                case SEVEN:
                    sevens++;
                    if(sevens == 2){
                        sevens = 3;
                        points = points + 7;
                        numberOfPars++;
                        isPar = true;
                    }
                    break;
                case SIX:
                    sixs++;
                    if(sixs == 2){
                        sixs = 3;
                        points = points + 6;
                        numberOfPars++;
                        isPar = true;
                    }
                    break;
                case FIVE:
                    fives++;
                    if(fives == 2){
                        fives = 3;
                        points = points + 5;
                        numberOfPars++;
                        isPar = true;
                    }
                    break;
                case FOUR:
                    fours++;
                    if(fours == 2){
                        fours = 3;
                        points = points + 4;
                        numberOfPars++;
                        isPar = true;
                    }
                    break;
                case THREE:
                    threes++;
                    if(threes == 2){
                        threes = 3;
                        points = points + 3;
                        numberOfPars++;
                        isPar = true;
                    }
                    break;
                case TWO:
                    twos++;
                    if(twos == 2){
                        twos = 3;
                        points = points + 2;
                        numberOfPars++;
                        isPar = true;
                    }
                    break;
            }
        }

        if(numberOfPars >= 2){
            System.out.println("is TwoPair");
            poker.setwhatHave("two pairs");
            poker.PlayerPoints(300);
        }
        else if(numberOfPars < 2){
            System.out.println("no TwoPair");
            onePair.isPar(dealerDeck);
        }
    }
}

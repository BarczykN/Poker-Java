package Winner;

import Card.Deck;
import Game.Poker;

public class OnePair {

    public void isPar(Deck dealerDeck){
        HighCard highCard = new HighCard();
        Poker poker = new Poker();

        int aces=0,kings=0,queens=0,jacks=0,tens=0,nines=0,eights=0,sevens=0,sixs=0,fives=0,fours=0,threes=0,twos=0;
        boolean isPar = false;
        int points = 0;

        for(int i = 0;i<7;i++){
            switch (dealerDeck.getCard(i).getValue()){
                case ACE:
                    aces++;
                    if(aces == 2){
                        points = points + 14;
                        isPar = true;
                    }
                    break;
                case KING:
                    kings++;
                    if(kings == 2){
                        points = points + 13;
                        isPar = true;
                    }
                    break;
                case QUEEN:
                    queens++;
                    if(queens == 2){
                        points = points + 12;
                        isPar = true;
                    }
                    break;
                case JACK:
                    jacks++;
                    if(jacks == 2){
                        points = points + 11;
                        isPar = true;
                    }
                    break;
                case TEN:
                    tens++;
                    if(tens == 2){
                        points = points + 10;
                        isPar = true;
                    }
                    break;
                case NINE:
                    nines++;
                    if(nines == 2){
                        points = points + 9;
                        isPar = true;
                    }
                    break;
                case EIGHT:
                    eights++;
                    if(eights == 2){
                        points = points + 8;
                        isPar = true;
                    }
                    break;
                case SEVEN:
                    sevens++;
                    if(sevens == 2){
                        points = points + 7;
                        isPar = true;
                    }
                    break;
                case SIX:
                    sixs++;
                    if(sixs == 2){
                        points = points + 6;
                        isPar = true;
                    }
                    break;
                case FIVE:
                    fives++;
                    if(fives == 2){
                        points = points + 5;
                        isPar = true;
                    }
                    break;
                case FOUR:
                    fours++;
                    if(fours == 2){
                        points = points + 4;
                        isPar = true;
                    }
                    break;
                case THREE:
                    threes++;
                    if(threes == 2){
                        points = points + 3;
                        isPar = true;
                    }
                    break;
                case TWO:
                    twos++;
                    if(twos == 2){
                        points = points + 2;
                        isPar = true;
                    }
                    break;
            }
        }

        if(isPar){
            System.out.println("is pair");
            poker.setwhatHave("pair");
            poker.PlayerPoints(200);
        }
        else{
            System.out.println("no pair");
            poker.isSpecial(false);
        }
    }
}

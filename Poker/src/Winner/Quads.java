package Winner;

import Card.Deck;
import Game.Poker;

public class Quads {

    public void isQuads(Deck dealerDeck){
        Poker poker = new Poker();
        FullHouse fullHouse = new FullHouse();

        int aces=0,kings=0,queens=0,jacks=0,tens=0,nines=0,eights=0,sevens=0,sixs=0,fives=0,fours=0,threes=0,twos=0;
        boolean isquad = false;

        for(int i = 0;i<7;i++){
            switch (dealerDeck.getCard(i).getValue()){
                case ACE:
                    aces++;
                    if(aces == 4){
                        poker.PlayerPoints(880);
                        isquad = true;
                    }
                    break;
                case KING:
                    kings++;
                    if(kings == 4){
                        poker.PlayerPoints(860);
                        isquad = true;
                    }
                    break;
                case QUEEN:
                    queens++;
                    if(queens == 4){
                        poker.PlayerPoints(840);
                        isquad = true;
                    }
                    break;
                case JACK:
                    jacks++;
                    if(jacks == 4){
                        poker.PlayerPoints(820);
                        isquad = true;
                    }
                    break;
                case TEN:
                    tens++;
                    if(tens == 4){
                        poker.PlayerPoints(800);
                        isquad = true;
                    }
                    break;
                case NINE:
                    nines++;
                    if(nines == 4){
                        poker.PlayerPoints(780);
                        isquad = true;
                    }
                    break;
                case EIGHT:
                    eights++;
                    if(eights == 4){
                        poker.PlayerPoints(760);
                        isquad = true;
                    }
                    break;
                case SEVEN:
                    sevens++;
                    if(sevens == 4){
                        poker.PlayerPoints(740);
                        isquad = true;
                    }
                    break;
                case SIX:
                    sixs++;
                    if(sixs == 4){
                        poker.PlayerPoints(720);
                        isquad = true;
                    }
                    break;
                case FIVE:
                    fives++;
                    if(fives == 4){
                        poker.PlayerPoints(700);
                        isquad = true;
                    }
                    break;
                case FOUR:
                    fours++;
                    if(fours == 4){
                        poker.PlayerPoints(680);
                        isquad = true;
                    }
                    break;
                case THREE:
                    threes++;
                    if(threes == 4){
                        poker.PlayerPoints(660);
                        isquad = true;
                    }
                    break;
                case TWO:
                    twos++;
                    if(twos == 4){
                        poker.PlayerPoints(640);
                        isquad = true;
                    }
                    break;
            }
        }
        if(isquad == true){
            System.out.println("is quad");
            poker.PlayerPoints(800);
        }

        else if(isquad == false){
            System.out.println("No quad");
            fullHouse.isFullHouse(dealerDeck);
        }

    }
}

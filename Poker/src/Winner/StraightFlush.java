package Winner;

import Card.Card;
import Card.Deck;
import Game.Poker;

public class StraightFlush {

    public void isStraightFlush(Deck dealerDeck){
        Quads quads = new Quads();
        Poker poker = new Poker();



        boolean isTrue = false;


       Card card;

        Deck diamondDeck = new Deck();
        Deck heartDeck = new Deck();
        Deck spadeDeck = new Deck();
        Deck clubDeck = new Deck();


        for(int i = 0;i<7;i++){
            switch (dealerDeck.getCard(i).getSuit()){
                case DIAMOND:
                    card = dealerDeck.getCard(i);
                    diamondDeck.addCard(card);
                    break;
                case CLUB:
                    card = dealerDeck.getCard(i);
                    clubDeck.addCard(card);
                    break;
                case HEART:
                    card = dealerDeck.getCard(i);
                    heartDeck.addCard(card);
                    break;
                case SPADE:
                    card = dealerDeck.getCard(i);
                    spadeDeck.addCard(card);
                    break;
            }
        }

        if(diamondDeck.deckSize() == 5){
           isTrue = isSF(diamondDeck);
        }
        else if(heartDeck.deckSize() == 5){
            isTrue =isSF(heartDeck);
        }
        else if(clubDeck.deckSize() == 5){
            isTrue =isSF(clubDeck);
        }
        else if(spadeDeck.deckSize() == 5){
            isTrue =isSF(spadeDeck);
        }



            if(isTrue){
                System.out.println("is straightflush");
                poker.setwhatHave("straightflush");
            }
            else if(isTrue == false){
                System.out.println("no straightflush");
                quads.isQuads(dealerDeck);
            }


    }


    public boolean isSF(Deck deck){
        int aces=0,kings=0,queens=0,jacks=0,tens=0,nines=0,eights=0,sevens=0,sixs=0,fives=0,fours=0,threes=0,twos=0;

        for(int i = 0;i<7;i++){
            switch (deck.getCard(i).getValue()){
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
            return true;
        }
        else {
            return false;
        }
    }
}

package Winner;

import Card.Card;
import Card.Deck;
import Game.Poker;

public class RoyalFlush {

    public void isRoyalFlush(Deck playerDeck,Deck dealerDeck){
        StraightFlush straightFlush = new StraightFlush();
        Poker poker = new Poker();

        Card card1 = playerDeck.getCard(0);
        Card card2 = playerDeck.getCard(1);

        int aces=0,kings=0,queens=0,jack=0,ten=0;
        int diamond = 0,club = 0,spade = 0,heart = 0;



        dealerDeck.addCard(card1);
        dealerDeck.addCard(card2);

        System.out.println("player cards: "+playerDeck.toString());
        System.out.println("dealer deck is "+dealerDeck.toString());

        //System.out.println("deck in RoyalFlush:"+dealerDeck.toString());
        for(int i = 0;i<7;i++){
            switch (dealerDeck.getCard(i).getValue()){
                case ACE:
                    aces++;
                    switch (dealerDeck.getCard(i).getSuit()){
                        case DIAMOND:
                            diamond++;
                            break;
                        case SPADE:
                            spade++;
                            break;
                        case HEART:
                            heart++;
                            break;
                        case CLUB:
                            club++;
                            break;
                    }
                    break;
                case KING:
                    kings++;
                    switch (dealerDeck.getCard(i).getSuit()){
                        case DIAMOND:
                            diamond++;
                            break;
                        case SPADE:
                            spade++;
                            break;
                        case HEART:
                            heart++;
                            break;
                        case CLUB:
                            club++;
                            break;
                    }
                    break;
                case QUEEN:
                    queens++;
                    switch (dealerDeck.getCard(i).getSuit()){
                        case DIAMOND:
                            diamond++;
                            break;
                        case SPADE:
                            spade++;
                            break;
                        case HEART:
                            heart++;
                            break;
                        case CLUB:
                            club++;
                            break;
                    }
                    break;
                case JACK:
                    jack++;
                    switch (dealerDeck.getCard(i).getSuit()){
                        case DIAMOND:
                            diamond++;
                            break;
                        case SPADE:
                            spade++;
                            break;
                        case HEART:
                            heart++;
                            break;
                        case CLUB:
                            club++;
                            break;
                    }
                    break;
                case TEN:
                    ten++;
                    switch (dealerDeck.getCard(i).getSuit()){
                        case DIAMOND:
                            diamond++;
                            break;
                        case SPADE:
                            spade++;
                            break;
                        case HEART:
                            heart++;
                            break;
                        case CLUB:
                            club++;
                            break;
                    }
                    break;
            }
        }
        if(aces >= 1 && kings >= 1 && queens >= 1 && jack >= 1 && ten >= 1&&(club>=5||diamond>=5 || spade>=5||heart>=5)){
            System.out.println("is royalflush");
            poker.setwhatHave("royalflush");
            poker.PlayerPoints(1000);

        }
        else {
            System.out.println("no royalflush");
            straightFlush.isStraightFlush(dealerDeck);
        }

    }


}

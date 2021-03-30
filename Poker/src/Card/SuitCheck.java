package Card;

import java.util.ArrayList;

public class SuitCheck {
    private ArrayList<Card> cards;

    public SuitCheck(){
        this.cards = new ArrayList<Card>();
    }

    public int cardSuit(Card aCard){
        int colour = 0;
        switch (aCard.getSuit()){
            case CLUB:
                colour = 1;
                break;
            case HEART:
                colour = 2;
                break;
            case SPADE:
                colour = 3;
                break;
            case DIAMOND:
                colour = 4;
                break;
        }
        return colour;
    }
}

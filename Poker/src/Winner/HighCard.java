package Winner;

import Card.Deck;
import Card.ValueCheck;
import Game.Poker;

public class HighCard {
    Poker poker = new Poker();

    public void highCard(Deck deck){
        int value = 0,value1 = 0,value2 = 0;

        ValueCheck valueCheck = new ValueCheck();

        value1 = valueCheck.cardValue(deck.getCard(0));
        value2 = valueCheck.cardValue(deck.getCard(1));

        if(value1 >= value2){
            value = value1;
        }
        else if(value1 < value2){
            value = value2;
        }

        poker.PlayerPoints(value);

    }
}

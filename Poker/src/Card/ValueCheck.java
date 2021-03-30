package Card;

public class ValueCheck {

    public int cardValue(Card aCard){
        int totalValue = 0;


        switch (aCard.getValue())
        {
            case TWO: totalValue += 2;break;
            case THREE: totalValue += 3;break;
            case FOUR: totalValue += 4;break;
            case FIVE: totalValue += 5;break;
            case SIX: totalValue += 6;break;
            case SEVEN: totalValue += 7;break;
            case EIGHT: totalValue += 8;break;
            case NINE: totalValue += 9;break;
            case TEN: totalValue += 10;break;
            case JACK: totalValue += 11;break;
            case QUEEN: totalValue += 12;break;
            case KING: totalValue += 13;break;
            case ACE: totalValue = 14;break;
        }


        return totalValue;
    }
}

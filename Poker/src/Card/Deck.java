package Card;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    //instance vars
    private ArrayList<Card> cards;

    //construct
    public Deck(){
        this.cards = new ArrayList<Card>();

    }

    public void createFullDeck(){
        //Generate Card Deck
        for(Suit cardSuit: Suit.values()){
            for(Value cardValue : Value.values()){
                //Add a new card to the mix
                this.cards.add(new Card(cardSuit,cardValue));
            }
        }
    }

    public void moveAllToDeck(Deck moveTo){
        int thisDeckSize = this.cards.size();

        for(int i = 0;i<thisDeckSize;i++)
        {
            moveTo.addCard(this.getCard(i));
        }

        for(int i = 0;i<thisDeckSize;i++)
        {
            this.removeCard(0);
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);

    }

    public int deckSize(){
        return this.cards.size();
    }

    public String toString(){
        String cardListOutput = "";

        for(Card aCard : this.cards )
        {
            cardListOutput += "\n " + aCard.toString();

        }
        return cardListOutput;
    }

    public void removeCard(int i){
        this.cards.remove(i);
    }

    public Card getCard(int i){
        return this.cards.get(i);
    }

    public void addCard(Card addCard){
        this.cards.add(addCard);
    }

    //Draw from the deck
    public void draw(Deck comingFrom){
        this.cards.add(comingFrom.getCard(0));
        comingFrom.removeCard(0);

    }

    public void setCards(Card card){
        this.cards.add(card);
    }

    //Return value of your hand cards


}

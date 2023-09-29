package org.example;

// Design Pattern
public class DeckOfCards {
    static DeckOfCards deck;
    //private ArrayList<Card> cards;
    private DeckOfCards() {
        //this.cards  new ArrayList<>(0);
    }

    //getInstance()
    public static DeckOfCards getInstance() {
        if (deck == null) {
            deck = new DeckOfCards();
        }
        return deck;
    }
}

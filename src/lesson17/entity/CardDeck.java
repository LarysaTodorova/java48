package lesson17.entity;

public class CardDeck {

    private Card[] deck = new Card[52];
    private Card[] deckShaffle = new Card[52];

    public Card[] getDeck() {
        return deck;
    }

    public Card[] getDeckShaffle() {
        return deckShaffle;
    }
}

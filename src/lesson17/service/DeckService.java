package lesson17.service;

import lesson17.entity.Card;

public class DeckService {

    public void fillDeck(Card[] deck) {

        String[] cardValue = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] cardSuit = {"♠","♣","♦","♥"};

        int counter = 0;

        for (int i = 0; i < cardValue.length; i++) {
            for (int j = 0; j < cardSuit.length; j++) {
                deck[counter] = new Card(cardValue[i],cardSuit[j]);
                counter++;
            }
        }
    }

    public Card[] deckShuffle(Card[] deck) {
     //   Card[] deckShuffle = new Card[52];

       // for (int i = 0; i < deck.length; i++) {
         //   deckShuffle[i] = deck[i];

        Card[] deckShuffle = deck.clone();

        for (int i = deckShuffle.length - 1; i > 0 ; i--) {
            int randomIndex = (int) (Math.random() * i);
            Card tempCard = deckShuffle[i];
            deckShuffle[i] = deckShuffle[randomIndex];
            deckShuffle[randomIndex] = tempCard;

            
        }

        return deckShuffle;

    }
}

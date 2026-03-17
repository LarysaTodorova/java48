package lesson17.service;

import lesson17.entity.Card;
import lesson17.entity.Player;

public class TableService {

    public void createPlayer(Player[] players, int numberCardForEachPlayer) {

        for (int i = 0; i < players.length; i++) {
            players[i] = new Player("Player # " + (i + 1), numberCardForEachPlayer);


        }

        }

        public void dealCards(Card[] deck, int numberCardsForEachPlayer, Player[] players) {

        int counter = 0;

            for (int i = 0; i < numberCardsForEachPlayer; i++) {
                for (int j = 0; j < players.length; j++) {

                    Card[] currentPlayerCards = players[j].getPlayerCards();
                    currentPlayerCards[i] = deck[counter];
                    counter++;
                    
                }
                
            }

    }
}

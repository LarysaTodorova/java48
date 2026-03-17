package lesson17.service;

import lesson17.entity.Card;
import lesson17.entity.Player;

import java.util.Arrays;

public class PrintService {

    public void printDeck(String message, Card[] deck) {

        System.out.println(message);

        int counter = 0;

        for (int i = 0; i <4; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print(deck[counter].getValue() + deck[counter].getSuit() + ", ");
                counter++;
    }
            System.out.println();
}

    }

    public void printPlayers(Player[] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("---------" + players[i].getName() + "-------");
            Card[] currentPlayerCards = players[i].getPlayerCards();
            for (int j = 0; j < currentPlayerCards.length; j++) {
                System.out.print(currentPlayerCards[j].getValue() + currentPlayerCards[j].getSuit() + ", ");

            }
            System.out.println();

        }
    }
}

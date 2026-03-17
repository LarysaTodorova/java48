package lesson17.entity;

import java.util.Arrays;

public class Player {

    private String name;
    private Card[] playerCards ;

    public Player(String name, int numberCardForEachPlayer) {
        this.name = name;
        this.playerCards = new Card[numberCardForEachPlayer];
    }

    public String getName() {
        return name;
    }

    public Card[] getPlayerCards() {
        return playerCards;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", playerCards=" + Arrays.toString(playerCards) +
                '}';
    }
}

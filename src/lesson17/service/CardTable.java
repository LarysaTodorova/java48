package lesson17.service;

import lesson17.entity.Card;
import lesson17.entity.CardDeck;
import lesson17.entity.Player;
import lesson5.superCalc.UserInput;

public class CardTable {

    private int numberCardsForEachPlyer = 5;

    private CardDeck cardDeck = new CardDeck();

    private DeckService service = new DeckService();

    private PrintService printService = new PrintService();

    private TableService tableService = new TableService();

    private UserInput userInput = new UserInput();

    private Player[] players;


    //=======================================

    public void game() {

        Card[] ourDeck = cardDeck.getDeck();

        service.fillDeck(cardDeck.getDeck());

        printService.printDeck("Печать оригинальной колоды", cardDeck.getDeck());

        Card[] deckShuffle = service.deckShuffle(ourDeck);

        printService.printDeck("Печать перемешанной колоды",deckShuffle);

        int numberOfPlayers = userInput.inputInteger("Введите количество игроков : ");

        players = new Player[numberOfPlayers];

        tableService.createPlayer(players, numberCardsForEachPlyer);

        tableService.dealCards(deckShuffle, numberCardsForEachPlyer, players);

        printService.printPlayers(players);


    }
}

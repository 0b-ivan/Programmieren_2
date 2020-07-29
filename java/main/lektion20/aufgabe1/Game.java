package main.lektion20.aufgabe1;

import java.util.ArrayList;
import java.util.Set;

public class Game {

    ArrayList <Card> deck;
    Set<Card> spieler1;
    Set<Card> spieler2;

    public Game(CardStack deck, Hand spieler1,Hand spieler2) {
        this.deck = deck.getDeck();
        this.spieler1 = spieler1.draw;
        this.spieler2 = spieler2.draw;
    }

}

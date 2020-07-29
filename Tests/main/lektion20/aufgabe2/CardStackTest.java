package main.lektion20.aufgabe2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardStackTest {

    CardStack testDeck = new CardStack();


    @Test
    void builder() {
        testDeck.builder();

    }

    @Test
    void getDeck_builder() {
        int cnt = 0;
        for (Card c:testDeck.getDeck()) {
            cnt++;
        }
        assertEquals(32,cnt);
    }

    @Test
    void print() {
        testDeck.print();
    }

    @Test
    void takeCard() {
        Card karte;
        Card vKarte;
        vKarte = testDeck.getDeck().iterator().next();
        karte = testDeck.takeCard();
        assertEquals(vKarte,karte);
    }

    @Test
    void shuffle() {
        CardStack unshuffeld = testDeck;
        testDeck.shuffle();

    }
}
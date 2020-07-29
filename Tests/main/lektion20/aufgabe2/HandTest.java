package main.lektion20.aufgabe2;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class HandTest {

    CardStack testDeck = new CardStack();
    Hand testHand = new Hand(testDeck);


    @Test
    void drawCard() {
        testHand.drawCard(testDeck);
        for (Object c: testHand.getDraw()) {
            System.out.println(c);
        }
    }
    @Test
    void sort(){
        //Collections.sort(testHand.getDraw());
    }
}
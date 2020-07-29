package main.lektion20.aufgabe1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void GameTest(){
        CardStack deck = new CardStack();
        Hand spieler1 = new Hand(deck);
        Hand spieler2 = new Hand(deck);

        Game testMaumau = new Game(deck, spieler1,spieler2);
        spieler1.drawCard(deck);
        spieler2.drawCard(deck);
        deck.print();
        System.out.println("Hand Spieler1:");
        spieler1.toString();
        System.out.println("Hand Spieler2:");
        spieler2.toString();


    }





}
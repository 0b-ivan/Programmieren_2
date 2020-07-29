package main.lektion20.aufgabe1;

import java.util.*;

public class CardStack {

    private ArrayList<Card> deck = new ArrayList<>();
    private Collection<Card> deckHeap = new ArrayList<>();
    Iterator<Card> iterator = deckHeap.iterator();

    CardStack() {
        builder();
        shuffle();
        heapBuilder();
    }

    public void builder() {
        for (Card.Farbe F : Card.Farbe.values()) {
            for (Card.Typ T : Card.Typ.values()) {
                this.deck.add(new Card(T, F));
            }
        }
    }

    public void heapBuilder() {
        for (Card c : deck) {
            deckHeap.add(c);
        }
    }

    //Getter
    public ArrayList<Card> getDeck() {
        return deck;
    }

    //Shuffler
    public void shuffle() {
        Collections.shuffle(deck, new Random());
    }

    //Printer
    public void print() {
        int cnt = 0;
        for (Card c : this.deck) {
            cnt++;
            System.out.println("Karte: " + cnt);
            System.out.println(c);
        }
    }

    public Card takeCard() {
        Card draw;
        draw = this.deck.get(0);
        this.deck.remove(0);
        return draw;
    }

    public Card takeCard2() {
        Card draw;
        draw = iterator.next();
        deckHeap.remove(iterator.next());
        return draw;
        }

    }




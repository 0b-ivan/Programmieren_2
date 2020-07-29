package main.lektion20.aufgabe2;

import java.util.*;

public class CardStack {


    Collection<Card> deck = new HashSet<>();
    //public  Iterator<Card> iterator = deck.iterator();

    CardStack() {
        builder();
    }



    public void builder() {
            for (Card.Farbe F : Card.Farbe.values()) {
                for (Card.Typ T : Card.Typ.values()) {
                    if(!deck.contains(F)&&!deck.contains(T))
                    this.deck.add(new Card(T, F));
                }
            }
    }

        //Getter
        public HashSet<Card> getDeck() {
            return (HashSet<Card>) this.deck;
        }

        //Shuffler
        public void shuffle () {
        List<Card> l = new ArrayList<>(this.deck);
        Collections.shuffle(l, new Random());
        this.deck = new HashSet<>(l);
        }

        //Printer
        public void print () {
            int cnt = 0;
            for (Card c : this.deck) {
                cnt++;
                System.out.println("Karte: " + cnt);
                System.out.println(c);
            }
        }


        public Card takeCard() {
            Card draw;
            draw = deck.iterator().next();
            deck.remove(deck.iterator().next());
            return draw;

        }

    }





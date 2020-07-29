package main.lektion20.aufgabe2;


import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;


public class Hand {

    //LIMIT DER KARTEN AUF DER HAND
    int drawlimit = 10;



    private Collection<Card> draw = new HashSet<>();
    public  Iterator<Card> iterator = draw.iterator();


    //SPIELER HAND mit 10 Karten
    public Hand(CardStack deck) {
        int i = 0;
            while (draw.size()<10) {
                drawCard(deck);
                i++;
            }

    }

    //Karte Ziehen
    public void drawCard(CardStack fromDeck) {
        if(draw.size()<10)
        this.draw.add(fromDeck.takeCard());
    }

    public HashSet getDraw() {
        return (HashSet) draw;
    }

    public String toString(){
        String hand = draw.toString();
        for (Object c:this.draw) {
            System.out.println(c);
        }
        return hand;
    }



}



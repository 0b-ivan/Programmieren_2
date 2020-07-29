package main.lektion20.aufgabe1;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


public class Hand {

    //LIMIT DER KARTEN AUF DER HAND
    int drawlimit = 10;
    Set<Card> draw = new HashSet<>();

    //SPIELER HAND mit 10 Karten
    public Hand(CardStack deck) {
        if (draw.size() <= 0) {
            while (draw.size() < drawlimit) {
                drawCard(deck);
            }
        }
    }

    //Karte Ziehen
    public void drawCard(CardStack fromDeck) {
        if (this.draw.size() < drawlimit && fromDeck.getDeck().size() > 0) this.draw.add(fromDeck.takeCard());
    }

    public void cardDrop(Card dropCard) {
        this.draw.remove(dropCard);
    }

    //Sort Cards

    public void sort(Hand spieler){


    }

    public String toString(){
        String hand = draw.toString();
        for (Card c:this.draw) {
            System.out.println(c);
        }
        return hand;
    }
}



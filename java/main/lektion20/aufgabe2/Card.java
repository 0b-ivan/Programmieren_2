package main.lektion20.aufgabe2;

import org.jetbrains.annotations.NotNull;

public class Card implements Comparable <Card> {
    private Typ typ;
    private Farbe farbe;

    //Constructor
    public Card(Typ typ, Farbe farbe) {
        this.typ = typ;
        this.farbe = farbe;
    }
    //Getter
    public Typ getTyp() { return typ; }
    public Farbe getFarbe() { return farbe; }

    @Override
    public int compareTo(Card c) {
        if (this.farbe.getValue() == c.getFarbe().getValue()){
            if (this.typ.getValue() < c.getTyp().getValue()) return 1;
            else if(this.typ.getValue() > c.getTyp().getValue()) return -1;

        }
        return 0;
    }

    //ENUMI
    public enum Typ {

        KOENIG(4),
        DAME(5),
        BUBE(1),
        ASS(2),
        ZEHN(3),
        NEUN(6),
        ACHT(7),
        SIEBEN(8);
        //SECHS(9),
        //FUENF(10),
        //VIER(11),
        //DREI(12),
        //ZWEI(13);
        //JOKER("1");
        int TYP;

        public int getValue() {
            return TYP;
        }

        Typ(int value) {
            this.TYP = value;
        }

    }

    public enum Farbe {
        PIK(1),
        KREUZ(2),
        KARO(3),
        HERZ(4);
        private int FARBE;

        public int getValue() {
            return FARBE;
        }

        Farbe(int FARBE) {
            this.FARBE = FARBE;
        }
    }
@Override
    public String toString() {
        String Karten = "";
        Karten += this.farbe;
        Karten += "-";
        Karten += this.typ;
        return Karten;

    }

}









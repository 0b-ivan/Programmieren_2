package main.lektion20.aufgabe1;

public class Card {
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

        private int TYP;

        Typ(int value) {
            this.TYP = value;
        }

    }

    public enum Farbe {
        PIK("Pik"),
        KREUZ("Kreuz"),
        KARO("Karo"),
        HERZ("Herz");
        private String FARBE;


        Farbe(String FARBE) {
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









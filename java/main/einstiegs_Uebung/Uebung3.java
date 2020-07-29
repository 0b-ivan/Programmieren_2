package main.einstiegs_Uebung;

public class Uebung3 {
    public static void main(String[] args){
        Artikel schuh1 = new Artikel(1,"NIKE");
        Artikel schuh2 = new Artikel(1,"SNIKERS");
        Bestellung bestellung1 = new Bestellung(100000);
        bestellung1.einfuegen(schuh1);
        bestellung1.einfuegen(schuh2);
        bestellung1.toString();

    }
}

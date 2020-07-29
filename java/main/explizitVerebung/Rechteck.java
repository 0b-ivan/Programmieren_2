package main.explizitVerebung;

public class Rechteck extends GeometrischeFigur {
    double laenge;
    double breite;
    public Rechteck() {

    }
    public Rechteck(double laenge, double breite){
        this.laenge = laenge;
        this.breite = breite;

    }
    @Override
    public double berechneFlaeche() {
        return laenge * breite;
    }
}

package main.explizitVerebung;

public class Quader extends GeometrischeFigur{
    double laenge;
    double breite;
    double tiefe;


    public Quader(double laenge, double breite, double tiefe){

        this.laenge = laenge;
        this.breite = breite;
        this.tiefe = tiefe;


    }
    public double berechneVolumen(){
        final double v = laenge * breite * tiefe;
        return v; }
    @Override
    public double berechneFlaeche(){
        return laenge*breite;
    }

}

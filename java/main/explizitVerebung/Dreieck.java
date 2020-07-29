package main.explizitVerebung;

public class Dreieck extends GeometrischeFigur {

    double hoehe;
    double grundseite;

    public Dreieck(double grundseite, double hoehe){

        this.grundseite = grundseite;
        this.hoehe = hoehe;
    }

    @Override
    public double berechneFlaeche(){
        return 0.5*grundseite*hoehe;
    }

}

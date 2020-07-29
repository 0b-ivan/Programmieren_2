package main.explizitVerebung;

public class Main {
    public static double berechneGesamtflaeche(GeometrischeFigur[] figuren){
        double summe = 0;
        for (int i = 0; i < figuren.length;i++){
            summe+= figuren[i].berechneFlaeche();
        }
        return summe;
    }


    public static void main(String[] args){
        // Geometrische Figuren;
        Dreieck d = new Dreieck(10,20);
        System.out.println(d.berechneFlaeche());
        Quader q = new Quader(10, 5 ,5);
        System.out.println(q.berechneVolumen());
        //-------------------------------------------

        //Vereinbarung einer Referenz auf GeoFigur
        GeometrischeFigur g;

        //zulassung Zuweisung Dreicl-Instanz subsituti. GeoFigur
        g = new Dreieck(10 ,5); //auto upcast

        //Nutzung der Ref erfolgt so , also ob g eine GeoFigur ist.

        System.out.println(g.berechneFlaeche());

        // Instanz Array von GeoFigur "Generalisiereung"

        GeometrischeFigur[] figuren = new GeometrischeFigur[3];
        figuren[0] = new Dreieck(2,4);
        figuren[1] = new Dreieck(20, 10);
        figuren[2] = new Rechteck(2,4);

        for (int i = 0; i < figuren.length; i++){
            System.out.println(figuren[i].berechneFlaeche());
        }
    }
}

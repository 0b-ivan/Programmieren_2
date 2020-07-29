package main.lektion16.aufgabe5;

public class Mensch implements Persönlichkeit {


    public Entscheidung entscheide(Gefahren gefahr)
    {
        if(Math.random()<= 0.2555555) return Entscheidung.UENTSCHIEDEN;
        if(gefahr == Gefahren.GEFAHR_LINKS  ) return Entscheidung.RECHTS;
        if(gefahr == Gefahren.GEFAHR_RECHTS ) return Entscheidung.LINKS;
        if(gefahr == Gefahren.GEFAHR_VORNE ) return Entscheidung.BREMESEN;
        return Entscheidung.UENTSCHIEDEN;
    }

}

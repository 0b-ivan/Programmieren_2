package main.pruefungsvorbereitung.musikStueck;

import java.util.Comparator;

public class VergleicheMusikStueckTitel implements Comparator <MusikStueck>{

    @Override
    public int compare(MusikStueck o1, MusikStueck o2) {
        //if(o1.titel > o2.titel) return 1;
        //if(o1.titel < o2.titel) return -1;
        return 0;
    }

}
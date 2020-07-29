package main.lektion14;

public class Person {
    public static final String NOTUPPC = "Kein Großbuchstabe";
    public static final String WRONGINPUT = "Falsche Eingabe";



    String vorname;
    String nachname;
    String strasse;
    String hausnummer;
    int    postleitzahl;
    String ort;

    public Person(String vorname, String nachname, String strasse,String hausnummer,int postleitzahl,String ort){

        if(!proofWort(vorname)) throw new RuntimeException(NOTUPPC);
        this.vorname = vorname;

        if (!proofWort(strasse)) throw new RuntimeException(NOTUPPC);
        this.strasse = strasse;

        if (!proofNumb(hausnummer)) throw new RuntimeException(WRONGINPUT);
        this.hausnummer = hausnummer;

        if (!proofWort(ort)) throw new RuntimeException(NOTUPPC);
        this.ort = ort;


        this.nachname = nachname;
        this.postleitzahl = postleitzahl;
    }



    static boolean  proofWort(String wort){
        return (wort.charAt(0)>='A' && wort.charAt(0)<='Z');
    }

    boolean proofNumb(String num){
        return (num.charAt(0)>='1' && num.charAt(0)<='9');

    }


}

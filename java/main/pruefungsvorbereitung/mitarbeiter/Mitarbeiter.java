package main.pruefungsvorbereitung.mitarbeiter;

import java.io.Serializable;

public class Mitarbeiter implements Serializable {

    private String vorname = null;
    private String nachname = null;
    private int nummer = 0;
    private transient int gehalt = 0;

    public Mitarbeiter(String vorname,String nachname, int nummer, int gehalt){
        this.vorname = vorname;
        this.nachname = nachname;
        this.nummer = nummer;
        this.gehalt = gehalt;
    }
    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public int getGehalt() {
        return gehalt;
    }

    public void setGehalt(int gehalt) {
        this.gehalt = gehalt;
    }

    @Override
    public String toString(){
      return "Nachname: " + nachname + "Vorname: " + vorname + "Personalnummer: " + nummer + " Gehalt: " + gehalt;
    }

   public  int hasCode(){
        final int prime = 31;
        int result = 1;
        return result;
   }

}

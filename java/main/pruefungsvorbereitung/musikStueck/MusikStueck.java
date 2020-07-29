package main.pruefungsvorbereitung.musikStueck;

public class MusikStueck {
    protected String titel;
    protected String interpret;
    protected int laenge;

    public MusikStueck(String titel, String interpret, int laenge) {
        this.titel = titel;
        this.interpret = interpret;
        this.laenge = laenge;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getInterpret() {
        return interpret;
    }

    public void setInterpret(String interpret) {
        this.interpret = interpret;
    }

    public int getLaenge() {
        return laenge;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }
}

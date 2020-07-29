package main.einstiegs_Uebung;

public class Artikel {
    private int artikelnummer;
    private String artikelname;
    private Artikel next;

    //Constructor
    public Artikel(int artikelnummer, String artikelname){
        this.artikelname=artikelname;
        this.artikelnummer=artikelnummer;
    }



    //Setter
    public void setArtikelnummer(int artikelnummer){
        this.artikelnummer=artikelnummer;
    }
    public void setArtikelname(String artikelname){
        this.artikelname=artikelname;
    }
    public void setNext(Artikel next){
        this.next=next;
    }
    //Getter
    public int getArtikelnummer(){
        return this.artikelnummer;
    }
    public String getArtikelname(){
        return this.artikelname;
    }
    public Artikel getNext(){
        return this.next;
    }

}


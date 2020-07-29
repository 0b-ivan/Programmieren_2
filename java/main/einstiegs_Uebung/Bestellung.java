package main.einstiegs_Uebung;

public class Bestellung {
    private int bestellnummer ;
    private Artikel start = new Artikel (0,"Null");
    private int artcnt = 0;


    public Bestellung(int bestellnummer){
        this.bestellnummer=bestellnummer;
    }


    public void einfuegen(Artikel next){
        Artikel temp = this.start;
        while(temp.getNext()!=null){
            temp=temp.getNext();
        }
        if(this.artcnt<50){
        temp.setNext(next);
        this.start=temp;
        this.artcnt++;
        }
        else this.start=temp;

    }
    public void loeschen(Artikel artikel){
        Artikel temp = this.start;
        while(temp!=null){
            if (temp.getNext().getArtikelname() == artikel.toString()
                    ||
                    temp.getNext().getArtikelnummer()== artikel.getArtikelnummer()){
                if (temp.getNext().getNext()!=null) {
                    temp.setNext(temp.getNext());
                }
                else temp.setNext(null);
            }


        }
        this.start = temp;
    }
    @Override
    public String toString(){
        Artikel temp = this.start;
        String text= this.start.getArtikelname();
        while (this.start.getNext()!=null){
            temp= temp.getNext();
            text = text + " " + temp.getArtikelname();
        }

        return text;
    }




}

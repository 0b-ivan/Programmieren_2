package main.lektion15.aufgabe2;

public class Dozent extends Person {


    @Override
    public String gibTaetigkeitAus(){
        System.out.println("Dozent");
        return "Dozent";
    }
}

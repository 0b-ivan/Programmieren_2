package main.lektion15.aufgabe3;

public abstract class Quiz {
    private String name;

    public Quiz(String name){
        this.name = name;
    }

    public abstract boolean proof();
}

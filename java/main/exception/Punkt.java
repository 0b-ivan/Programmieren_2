package main.exception;

import java.util.InputMismatchException;

public class Punkt {

    int x;
    int y;



    public void verschiebePunkt(int zielX, int zielY ){
        if (zielX < 0 || zielY < 0){
            throw new IllegalArgumentException("Keine negativ Koordianten in x oder y");
        }
        if (zielX > 1920){
            throw new IllegalArgumentException("X darf nicht größer 1920 sein ");
        }
        if (zielY > 1080){
            throw new IllegalArgumentException("Y darf nicht größer 1080 sein");
        }
        try {
            x = zielX;
        }
        catch (InputMismatchException e){
            System.out.println("Nur Ganzzahlige Eingaben:");
        }
        finally {
            System.out.println("Methode ende!");
        }
        x = zielX;
        y = zielY;
    }
}

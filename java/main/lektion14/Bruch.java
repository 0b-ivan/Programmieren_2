package main.lektion14;

public class Bruch {
    public static final String NEGATIV = "Einer der übergebenen Punkte negativ";
    int x;
    int y;

    public Bruch (int zaehler, int nenner) throws ArithmeticException{ // Konstruktor mit exception!

        if (nenner <= 0) throw new ArithmeticException(NEGATIV); // exception
        this.x=zaehler;
        this.y=nenner;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }


}

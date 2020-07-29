package main.lektion14;

public class Kuglevolumen {

    public static  final String NEGATIV = "Übergebener Radius ist negativ";

    public static double berechneKugelVolumen (double radius) throws ArithmeticException {

        if (radius < 0) throw new ArithmeticException(NEGATIV);

        return 4.00/3.00*Math.PI*radius*radius*radius;
    }
}
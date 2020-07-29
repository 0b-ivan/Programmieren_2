package main.einstiegs_Uebung;

public class Uebung1 {
    public static void main(String[] args){

        printQuadrat(4);


    }
   public static void printQuadrat(int zeilen){

        for (int i = 0; i< zeilen; i++){
            if (i>zeilen-1 || i<zeilen-1 ) System.out.print("*");
            for (int j = 0 ; j < zeilen; j++){

                if(i==zeilen-1 || i==1)System.out.print("*");
                else System.out.print(" ");

            }
            if (i>zeilen-1 || i<zeilen-1 ) System.out.print("*");

            System.out.println();
        }

    }

}

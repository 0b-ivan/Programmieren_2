package main.lektion16.aufgabe2;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleChangeCalculatorTest {
    NewChangeCalculator calculator = new  NewChangeCalculator();
    int euro=15;
    int cent=150;
    int[] ergebnis;
    String [] text = new String [] {" 01-Cent"," 02-Cent"," 05-Cent"," 10-Cent"," 20-Cent"," 50-Cent"," 01-Euro"," 02-Euro"};

    @Test
    void ChangetoString() {
        ergebnis=calculator.getChange(euro,cent);
        for (int i = 0; i < ergebnis.length;i++){
            System.out.print( ergebnis[i] + " *" + text[i]+"\n");
                }
        double aDoubleErgebnis = (getVauleT(ergebnis))/ 1.0E02;
        System.out.println(aDoubleErgebnis +" Euro");
        }

    @Test
    void getChange(){
        ergebnis=calculator.getChange(euro,cent);
        assertEquals((euro*100)+cent,getVauleT(ergebnis));
    }

    int getVauleT(@NotNull int... set){
        int result = 0;
         result += set[7] * 200;
         result += set[6] * 100;
         result += set[5] * 50;
         result += set[4] * 20;
         result += set[3] * 10;
         result += set[2] * 5;
         result += set[1] * 2;
         result += set[0] * 1;
        return result;
    }
}
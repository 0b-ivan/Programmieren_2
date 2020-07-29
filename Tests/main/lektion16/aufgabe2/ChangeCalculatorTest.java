package main.lektion16.aufgabe2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangeCalculatorTest {

    @Test
    void getChange() {
        NewChangeCalculator chainge = new NewChangeCalculator();

        int[] expExchange = {1,1,0,1,1,0,0,5};
         chainge.getChange(10,33);

        assertArrayEquals( chainge.getChange(10,33),expExchange);
    }
}
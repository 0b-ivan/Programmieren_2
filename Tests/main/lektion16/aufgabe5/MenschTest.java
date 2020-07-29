package main.lektion16.aufgabe5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenschTest {

    @Test
    void entscheide() {
        Mensch tom = new Mensch();
        Gefahren auto;
        auto = Gefahren.GEFAHR_RECHTS;
        assertEnscheidung(Entscheidung.LINKS,tom.entscheide(auto));


    }
    void assertEnscheidung(Entscheidung expect,Entscheidung actual){
            Entscheidung reaktion = actual;
            if (reaktion == Entscheidung.UENTSCHIEDEN) {
                System.out.println("Unentschieden ");
                assertTrue(reaktion==Entscheidung.UENTSCHIEDEN);
            }
            else assertEquals(expect, actual);

    }
}
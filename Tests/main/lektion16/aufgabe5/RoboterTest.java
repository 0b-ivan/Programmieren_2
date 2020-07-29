package main.lektion16.aufgabe5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoboterTest {

    @Test
    void entscheide() {
        Roboter wally = new Roboter();
        Gefahren auto;
        auto = Gefahren.GEFAHR_LINKS;
        assertEquals(Entscheidung.RECHTS,wally.entscheide(auto));
        auto = Gefahren.GEFAHR_RECHTS;
        assertEquals(Entscheidung.LINKS,wally.entscheide(auto));
        auto = Gefahren.GEFAHR_VORNE;
        assertEquals(Entscheidung.BREMESEN,wally.entscheide(auto));
    }
}
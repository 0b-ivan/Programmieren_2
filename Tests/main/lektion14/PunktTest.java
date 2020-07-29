package main.lektion14;
import main.lektion14.Punkt;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class PunktTest {

    @Test
    void safe() {
        Punkt p = new Punkt();
        p.verschiebePunkt(1, 2);

    }

    @Test
    void xTooBig() {
        Punkt p = new Punkt();
        try {
            p.verschiebePunkt(3000, 500);
            fail();
        } catch (Throwable e) {
            if (!e.getMessage().equals("X darf nicht Groesser 1920 sein")) fail("Test fehlgeschlagen");
        }
    }
    @Test
    void yTooBig() {
        Punkt p = new Punkt();
        try {
            p.verschiebePunkt(300, 5000);
            fail();
        } catch (Throwable e) {
            if (!e.getMessage().equals("Y darf nicht Groesser 1080 sein")) fail("Test fehlgeschlagen");
        }
    }

    @Test
    void yPointNegative() {
        Punkt p = new Punkt();
        try {
            p.verschiebePunkt(500, -500);
            fail();
        } catch (Throwable e) {
            if (!e.getMessage().equals("PUNKT_NEGATIV")) fail("Test fehlgeschlagen");
        }
    }
    @Test
    void xPointNegative() {
        Punkt p = new Punkt();
        try {
            p.verschiebePunkt(-500, 500);
            fail();
        } catch (Throwable e) {
            if (!e.getMessage().equals("PUNKT_NEGATIV")) fail("Test fehlgeschlagen");
        }
    }
}
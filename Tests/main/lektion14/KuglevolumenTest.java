package main.lektion14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class KuglevolumenTest {

    @Test
    void withNull() {
        assertEquals(Kuglevolumen.berechneKugelVolumen(0),0,0.0000);
    }
    @Test
    void withOne() {
        assertEquals(Kuglevolumen.berechneKugelVolumen(1),4.1887902047863,0.000000001);
    }
    @Test
    void withFive() {
        assertEquals(Kuglevolumen.berechneKugelVolumen(5), 523.5987755982989, 0.000000001);
    }
    @Test
    void testNegativ() {
        try { assertEquals(Kuglevolumen.berechneKugelVolumen(-1),0,0.01); }
        catch (RuntimeException e) {assertEquals(e.getMessage(), Kuglevolumen.NEGATIV);  }
    }
}
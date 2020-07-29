package main.lektion14;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StreckeTest {


    @Test
    void negativA() {
        try {
            Strecke A = new Strecke(-1 ,7);}
        catch (ArithmeticException e) {if(!e.getMessage().equals(main.lektion14.Strecke.NEGATIV_WERT)) fail("fehler");}
    }
    @Test
    void negativB() {
        try {Strecke A = new Strecke(1 ,-7);}
        catch (ArithmeticException e) {if(!e.getMessage().equals(Strecke.NEGATIV_WERT)) fail("fehler");}
    }

    @Test
    void aCollisionB() {
        Strecke PathA = new Strecke(3,30);
        Strecke PathB = new Strecke(6,12);
        assertTrue(PathA.collision(PathA,PathB));
    }

    @Test
    void BCollisionA() {
        Strecke PathA = new Strecke(4,12);
        Strecke PathB = new Strecke(1,7);
        assertTrue(PathA.collision(PathA,PathB));
    }
    @Test
    void notCollision() {
        Strecke PathA = new Strecke(1,7);
        Strecke PathB = new Strecke(7,12);
        assertFalse(PathA.collision(PathA,PathB));
    }
    @Test
    void notColision2() {
        Strecke PathA = new Strecke(5,7);
        Strecke PathB = new Strecke(1,3);
        assertFalse(PathA.collision(PathA,PathB));
    }

    @Test
    void testtoStringPath() {
        Strecke PathA = new Strecke(1,7);
        assertEquals("1------7",PathA.toString());

    }
    @Test
    void TesttoStringPoint() {
        Strecke PathA = new Strecke(1,1);
        assertEquals("1",PathA.toString());

    }



}

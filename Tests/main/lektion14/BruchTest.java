package main.lektion14;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BruchTest {

    @Test
   void NegativArithmetic()
    {

        try { Bruch b = new Bruch(1,-2); }
        catch (ArithmeticException e) {
            if (!e.getMessage().equals(Bruch.NEGATIV)) fail("test fehlgeschlagen");
        }
    }

    @Test
    void SuccseedPositiv()
    {
        Bruch test = new Bruch (1,2);
        assertTrue(1 == test.getX() && 2==test.getY());
    }
    @Test
    void SuccseedNegativ()
    {
        Bruch test = new Bruch (-1,2);
        assertTrue(-1 == test.getX() && 2==test.getY());
    }


}






package main.lektion18.aufgabe3;

import main.lektion19.aufgabe3.Browser;
import org.junit.jupiter.api.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;


import static org.junit.jupiter.api.Assertions.*;

class BrowserTest {

    Browser brow = new Browser();

    @Test
    void back()  {

        try {
            Optional<URL> ob = brow.back();
                assertNotNull(ob.get().toString());


        }
        catch (MalformedURLException e){
            assertEquals("MalformedURLException ",e);

        }

    }


}
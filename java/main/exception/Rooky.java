package main.exception;

import java.util.MissingResourceException;

public class Rooky {

    String name;

    public void Rooky(String name) {
        if (name.charAt(0) < 'A' || name.charAt(0) > 'Z') {
            throw new MissingResourceException("fehler", "auto", "Pferd");


        }
    }
}

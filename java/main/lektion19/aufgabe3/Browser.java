package main.lektion19.aufgabe3;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

public class Browser {


    public static void main(String[] args) throws MalformedURLException {

        Browser brow = new Browser();
        System.out.println("Optional back");
        Optional<URL> ob = brow.back();
        if(ob.isPresent()) System.out.println(ob.toString());

    }

    public Optional<URL> back() throws MalformedURLException {
        Optional<URL> optUrl = Optional.ofNullable(Math.random() < 0.5 ? new URL("http://google.de") : null);
        return optUrl;
    }


}
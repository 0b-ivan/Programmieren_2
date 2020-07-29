package main.pruefungsvorbereitung.dateisuche;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinderTest {


    @Test
    void findStringInFiles() {
        String s = "Affe";
        String [] f = new String[4];
        f[0]= "test.txt";
        f[1]= "test.txt";
        f[2]= "test.txt";
        f[3]= "test.txt";
        Finder.findStringInFiles(s,f);
    }
}
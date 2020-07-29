package main.lektion18.aufgabe1;
import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {

        String data = "fakt.txt";

        int w = 5000000;
        int i = 5100000;
        int e = 6100000;

        DataGen.para(data,5000000,7000000);

        Spliter.para(data,w,i,e);

}

}


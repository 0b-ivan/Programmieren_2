package main.pruefungsvorbereitung.mitarbeiter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class main {
    public static void main(String [] args){
        Mitarbeiter a = new Mitarbeiter("a","a",0,1);
        Mitarbeiter b = new Mitarbeiter("b","b",1,1);
        Mitarbeiter c = new Mitarbeiter("c","c",2,1);

        Mitarbeiter [] liste = new Mitarbeiter[3];

        liste [0] = a;
        liste [1] = b;
        liste [2] = c;

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("mitarbeiter.dat"))){
            oos.writeObject(liste);
            oos.flush();

        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}

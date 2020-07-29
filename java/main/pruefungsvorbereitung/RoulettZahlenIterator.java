package main.pruefungsvorbereitung;

import java.util.Iterator;

public class RoulettZahlenIterator implements Iterator <Integer> {

    int cnt = 0;

    @Override
    public boolean hasNext() {
        if (cnt >= 3) return false;
        return true;
    }

    @Override
    public Integer next() {
       Integer zahl;
       zahl = (int) (Math.random()*36);
       if (zahl == 0){
           cnt ++;
           next();
       }
       return zahl;
    }

    @Override
    public void remove() {

        throw new UnsupportedOperationException();
    }
}

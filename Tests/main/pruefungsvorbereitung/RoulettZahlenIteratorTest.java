package main.pruefungsvorbereitung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoulettZahlenIteratorTest {


    @Test
    void hasNext() {
        RoulettZahlenIterator rzi = new RoulettZahlenIterator();
        for(;rzi.hasNext();){
            System.out.println(rzi.next());
        }
        assertEquals(false,rzi.hasNext());
    }

    @Test
    void next() {
    }

    @Test
    void remove() {
    }
}
package main.lektion14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {



    @Test
    void FailNoUpperCase(){
        try{Person test = new Person("Max","Mustermann", "Musterstraße", "A",9999,"Musterstadt");}
        catch(Throwable e){
            if((!e.getMessage().equals(Person.NOTUPPC)) || (!e.getMessage().equals(Person.WRONGINPUT))) fail("Test fehlgeschlagen") ;
        }

    }
    @Test
    void FailNoInput(){
        try{Person test = new Person("Max","Mustermann", "Musterstraße", "falsch",9999,"Musterstadt");
            fail("Test fehlgeschlagen"); }
        catch(Throwable e){
            assertEquals(Person.WRONGINPUT, e.getMessage());

        }

    }

    }



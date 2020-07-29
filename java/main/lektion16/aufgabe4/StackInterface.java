package main.lektion16.aufgabe4;

import java.util.ArrayList;

public interface StackInterface {

    ArrayList  arrayStack = new ArrayList();
    public boolean push(Object o) throws Exception;
    public Object pop () throws Exception;
    public void printFullStack();


}

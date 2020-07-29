package main.lektion16.aufgabe4;


import java.util.ArrayList;

public class Stack implements StackInterface{
    private ArrayList arrayStack = new ArrayList<>();

    public boolean push(Object o) throws Exception
    {
        int size = this.arrayStack.size();
        this.arrayStack.add(o);
        if (size < this.arrayStack.size() && ((this.arrayStack.get(this.arrayStack.size()-1)) == o)){
           return true;
        }
        throw new ArrayStoreException("Unbekanter Fehler");
    }
    public Object pop () throws Exception{
        if (this.arrayStack.isEmpty()) throw new NullPointerException("empty Stack");
        int size = this.arrayStack.size();
        Object popObjekt = this.arrayStack.get(size-1);
        arrayStack.remove(arrayStack.size()-1);
        return popObjekt;
    }

    public void printFullStack() {
        System.out.println("Im Stack liegen folgende Elemente");
        for (Object e: this.arrayStack) { System.out.println("["+e+"]"); }
    }
}

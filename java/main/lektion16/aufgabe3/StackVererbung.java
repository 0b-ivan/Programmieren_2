package main.lektion16.aufgabe3;


//Klasse zum Upload ins e-learning
@SuppressWarnings("all")

public class StackVererbung {

    private int length = this.stack.length;
    private Object[] stack;

    public StackVererbung() {

    }

    public StackVererbung(Object[] stack) {
        this.stack = stack;
    }


    public Object[] push(Object object) {

        Object[] newSteck = new Object[this.length + 1];
        newSteck = this.stack;
        newSteck[this.length + 1] = object;
        return newSteck;
    }

    public Object[] pop() {
        Object[] newSteck = new Object[this.length - 1];

        return newSteck;
    }

    @Override
    public String toString() {
        for (int i = 0; i < this.length; i++) {
            System.out.println(this.stack[i].getId());
        }
        return null;
    }

}

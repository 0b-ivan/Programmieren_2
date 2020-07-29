package main.lektion16.aufgabe4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {




    @Test
    void push() throws Exception {
        Stack testStack = new Stack();
        testStack.push(3);
        testStack.push(4);
        testStack.push(5);
        testStack.push(6);
        assertTrue(testStack.push(3));
        testStack.printFullStack();

    }

    @Test
    void pop() throws Exception {
        Stack testStack = new Stack();
        testStack.push(3);
        testStack.push(3);
        testStack.push(6);
        testStack.push(9);
        testStack.push(10);
        testStack.push("a");
        testStack.push("Hallo");
        //System.out.println(testStack.pop());
        testStack.printFullStack();
    }
}
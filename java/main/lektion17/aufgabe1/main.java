package main.lektion17.aufgabe1;


import java.io.File;
import java.io.FileInputStream;

public class main {
    public static void main(String[] args) throws Exception {

        //exceptionNumberFormat();
        //exceptionArrayIndexOutOfBounds(3,4);
        //exceptionNullpointer();
        //outOffMemo();
        readLines();
        //ArithmeticExceptionTest();

    }


    static void exceptionNumberFormat(){
        Integer.parseInt("abc");
    }

    static void exceptionArrayIndexOutOfBounds(){
        int [] array  = new int[3];
        array[4]=3;
    }
    static void exceptionNullpointer()throws Exception{
        Object obj = null;
        obj.hashCode();
    }

    static void outOffMemo(){int [][] c = new int[100000][100000];}
    static void readLines()throws Exception{

        FileInputStream fis = new FileInputStream(new File("test", "Test"));
    }

    static void ArithmeticExceptionTest()throws Exception{
        int i = 3;
        i =i/0;
    }




}

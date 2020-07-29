package main.lektion17.aufgabe3;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BufferedStreams {

    public static void main(String[] args) throws IOException {
        avg(copyErrorHandlingUnbuffert(), copyErrorHandlingUnbuffert());

    }

    static  InputStream input(){
        Scanner scan = new Scanner(System.in);
        while (true) {
            try  {
            InputStream fis = new FileInputStream(scan.nextLine());
            return fis;
            } catch (IOException e) {
                System.out.println("Datei nicht gefunden. \nDateipfad erneut eingeben: ");
                continue;
            }
        }
    }

    static void copy(InputStream sc, OutputStream os) throws IOException
    {
        byte[] b = new byte[4096];
        int n;
        do {
            n = sc.read(b);
            if (n != -1) os.write(b, 0, n);
        }
        while (n != -1);
    }

    static long copyErrorHandlingUnbuffert() throws IOException     //funktioniert
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dateipfad Unbuffered: ");
        long x = 0;
        long duration;

       InputStream fis = input();
       OutputStream fos = new FileOutputStream("copyA.mp3");

                for (int i = 0; i < 100; i++) {
                    long startTime = System.nanoTime();
                    copy(fis, fos);
                    long endTime = System.nanoTime();
                    duration = endTime - startTime;
                    x += duration;
                }

        return  x;
    }
    /*static long copyErrorHandlingBuffert()     //funktioniert
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dateipfad Unbuffered: ");
        long x = 0;
        long duration;
        while (true)
        {

            try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(scan.nextLine()));
                 OutputStream bos = new FileOutputStream("_copyA.mp3");)
            {
                for (int i = 0; i < 100; i++) {
                    long startTime = System.nanoTime();
                    copy(bis, bos);
                    long endTime = System.nanoTime();
                    duration = endTime - startTime;
                    x += duration;
                }
                break;
            } catch(IOException e)
            {
                System.out.println("Datei nicht gefunden. \nDateipfad erneut eingeben: ");
                continue;
            }
        }
        return  x;
    }*/


    static void avg(long x, long y)
    {
        x /= 100;
        System.out.println("unbuffered: " + x);
        y /= 100;
        System.out.println("buffered: " + y);
        double n = (double) x / (double) y;
        n = (n-1)*100;
        DecimalFormat f = new DecimalFormat("#0.00");
        System.out.println("buffered streams sind um " + f.format(n) + "% schneller");
    }






}

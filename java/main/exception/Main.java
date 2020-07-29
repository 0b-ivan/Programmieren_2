package main.exception;

import java.util.InputMismatchException;
import java.util.Scanner;  /*Scanner Import */

public class Main {
    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in); /*New Scanner (scanner)*/
        boolean failure = true;
        String input;

        do { /*do while block um die Eingabe wiederholen zuu können*/

            System.out.print("Bitte geben sie eine Zahl ein: ");

        try /*code block(method) without exceptions "make me happy"*/ {

            input = scanner.nextLine();
            int a = Integer.valueOf(input); /*Umwandelung String-> Integer*/
            System.out.println(try_case(a));
            failure=false;

        } catch (NumberFormatException e) /*code with exceptions "make me less happy"*/ {
            System.out.println("fehler!");
            scanner.nextLine();
            //throw new RuntimeException("Falsches Datenformat"); /*Selbst erzeugte Fehlerausgabe*/
        } catch (InputMismatchException e) /*code with exceptions "make me less happy"*/ {
            System.out.println("fehler!");
            scanner.nextLine();
            //throw new RuntimeException("Falsches Datenformat"); /*Selbst erzeugte Fehlerausgabe*/

        }

    }
    while(failure);
    scanner.close();



    }

    public static int try_case(int a){ /*code_case with boolean return statement*/

        return (a*a);

    }


}

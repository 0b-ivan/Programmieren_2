package main.lektion15.aufgabe2;

public class Student extends Person {
    @Override
    public String gibTaetigkeitAus(){
        System.out.println("Student");
        return "Student";
    }
}

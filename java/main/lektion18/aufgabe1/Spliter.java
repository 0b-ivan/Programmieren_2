package main.lektion18.aufgabe1;
import java.io.*;


public class Spliter {

    public static void para(String dateiname, int a, int b, int c){

        String path ="/Users/ivanbabayev/Documents/Uni/IntelliJProjects/Programmieren_2/java/main/lektion18/res/";

        try (BufferedReader br = new BufferedReader(new FileReader(path + dateiname ));
             BufferedWriter bwINF = new BufferedWriter(new FileWriter(path + "inf.txt"));
             BufferedWriter bwWINF = new BufferedWriter(new FileWriter(path + "winf.txt"));
             BufferedWriter bwEC = new BufferedWriter(new FileWriter(path + "ec.txt"));)

        { do { if (sortLine(br, bwINF, bwWINF, bwEC,a,b,c)) break; } while(true);}

        catch(Exception e){e.printStackTrace();}
}
    private static boolean sortLine(BufferedReader br, BufferedWriter bwINF, BufferedWriter bwWINF, BufferedWriter bwEC ,int a, int b, int c) throws IOException {

        String line = br.readLine();
        int vaule =0;
        if (line == null) return true;
        vaule= Integer.valueOf(line);
        if (vaule>=a && b > vaule)  { bwWINF.write(line); bwWINF.newLine();} // Winf  claus
        if (vaule>=b && c > vaule)  { bwINF.write(line); bwINF.newLine();} // Inf   claus
        if (vaule>=c)               { bwEC.write(line); bwEC.newLine();} // EC    claus
        return false;
    }

}


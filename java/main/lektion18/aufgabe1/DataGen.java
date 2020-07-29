package main.lektion18.aufgabe1;

import java.io.*;


public class DataGen {

    public static boolean para(String dataname, int start, int offset) {

        String path = "/Users/ivanbabayev/Documents/Uni/IntelliJProjects/Programmieren_2/java/main/lektion18/res/";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path + dataname));)
        {
            para(start, offset, bw);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public static void para(int start, int offset, BufferedWriter bw) throws IOException {
        while (offset >=start) {
            String input = String.valueOf(start);
            bw.write(input);
            bw.newLine();
            start++;
        }
    }
}


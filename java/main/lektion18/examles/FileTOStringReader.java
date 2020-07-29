package main.lektion18.examles;

import java.io.*;

public class FileTOStringReader {

    //DataReader

    public static void copyImproved(InputStream is, OutputStream os) throws IOException{
        byte[] b = new byte[4096];
        int n;
        do {
            n = is.read(b);
            if (n != -1) os.write(b, 0, n);
        }
        while (n != -1);

    }

    public static String readFromFile(String filename) throws IOException{
        FileInputStream fis = new FileInputStream(filename);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        copyImproved(fis, baos);
        fis.close();
        return baos.toString();
    }


    public static void main(String[] args) throws  IOException{
        String s = readFromFile("/Users/ivanbabayev/Documents/Uni/IntelliJProjects/Programmieren_2/java/main/lektion18/hello.txt");
        System.out.println(s);
    }




}

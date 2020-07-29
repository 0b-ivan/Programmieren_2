package main.pruefungsvorbereitung.dateisuche;

import java.io.*;

public class Finder {


    public BufferedReader getSystemInAsBufferedReader(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br;

    }
    public BufferedReader getSystemInAsBufferedReader2() throws IOException {

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
           return br;
        }

    }

    public static void findStringInFiles(String searchString, String[] filenames)  {
        for (int i = 0; i<filenames.length;i++) {
            try(BufferedReader br = new BufferedReader(new FileReader(filenames[i]))) {
                int lineNumber = 0;
                String line;
                while ((line=br.readLine()) != "-1"){
                    lineNumber++;
                    if(line.contains(searchString)){
                        System.out.println("Gefunden in : "+ filenames[i] + "in der Zeile: " +lineNumber );
                    }
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

package main.lektion18.aufgabe2;

import java.io.*;
import java.io.Serializable;

public class Hangman implements Serializable {
    private String path = "/Users/ivanbabayev/Documents/Uni/IntelliJProjects/Programmieren_2/java/main/lektion19/res/";
    private String wort;
    private String cover;
    private int length;

    public Hangman() throws IOException {
        initiator("woerter.txt");

    }

    private void initiator(String data) throws IOException {
        try (BufferedReader list = new BufferedReader(new FileReader(path + data))) {
            this.wort = list.readLine();
            int i = this.wort.length();
            do {
                i--;
                this.cover += "-";
            } while (i > 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getWort() {
        return wort;
    }

    private void setWort(String wort) {
        this.wort = wort;
    }

    public String getCover() {
        return cover;
    }

    private void setCover(String cover) {
        this.cover = cover;
    }

    public int tryCase(char c,int cnt){

        for (int i = 0; i < length; i++ ){
            if (this.wort.charAt(i) == c) {
                this.cover.replace(cover.charAt(i),c);
            }
            else cnt--;

        }

        System.out.println(this.cover);
        return cnt;
    }
}

package main.pruefungsvorbereitung.morse;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class Morse {

    public static void main(String [] args){
        System.out.print(zeichenKetteToMose("Klausurerfolg"));
    }

    public static String[][] tabelle ={
            {"A",".-"},
            {"B", "-..."},
            {"C","-.-."},
            {"D","-.."},
            {"E","."},
            {"F","..-."},
            {"G","--."},
            {"H","...."},
            {"I",".."},
            {"J",".---"},
            {"K","_._"},
            {"L",".-.."},
            {"M","--"},
            {"N","-."},
            {"O","---"},
            {"P",".--."},
            {"Q","--.-"},
            {"R",".-."},
            {"S","..."},
            {"T","-"},
            {"U","..-"},
            {"V","...-"},
            {"W",".--"},
            {"X","-..-"},
            {"Y","-.--"},
            {"Z","--.."}
    };

   public static HashMap getMorseCodeMap(String [][] tablle){
        HashMap hm = new HashMap();
        for(int i = 0; i< tablle.length;i++){
            hm.put(tablle[i][0],tablle[i][1]);
        }
        return hm;
    }
    @NotNull
    static String zeichenKetteToMose(String s){
        String key ="";
        HashMap hm = getMorseCodeMap(tabelle);
        for (int i = 0; i< s.length();i++){
            key += (hm.get(Character.toString(Character.toUpperCase((s.charAt(i))))));

            key +=(" ");
        }
        return key.toString();
    }




}

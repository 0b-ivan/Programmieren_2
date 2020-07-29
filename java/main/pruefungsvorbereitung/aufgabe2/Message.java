package main.pruefungsvorbereitung.aufgabe2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {
    private int charCounter;
    private String message;
    private final String creationDate;

    public Message(String message) throws Exception{
        if(message.length()<=140) {
            this.message = message;
            this.charCounter = message.length();
            this.creationDate = Date();
        }
        else throw new Exception("Nachricht zu lang");

    }

    public int getCharCounter() {
        return charCounter;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        this.charCounter = message.length();
    }

    public String getCreationDate() {
        return creationDate;
    }


    private String Date(){
        Date date = java.util.Calendar.getInstance().getTime();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.yyyy");
        String dateString = dateFormatter.format(date);
        return dateString;
    }
}

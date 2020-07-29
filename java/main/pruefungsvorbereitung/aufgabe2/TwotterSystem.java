package main.pruefungsvorbereitung.aufgabe2;

import main.pruefungsvorbereitung.aufgabe1.User;
import main.pruefungsvorbereitung.aufgabe3.DownloadManager;

import java.util.*;

public class TwotterSystem {
    private Map<User, List<Message>> nachrichten;

    public TwotterSystem(){

        this.nachrichten = new HashMap<>();
    }


    public void addUser(User user) {
        List<Message> messages = new ArrayList<>();
        this.nachrichten.put(user, messages);
    }

    public void addMessages(User user, Message message) {
        List<Message> newMessages = this.nachrichten.get(user);
        newMessages.add(message);
        this.nachrichten.put(user,newMessages);
    }

    public List<Message> getAllMessages(){
        List<Message> temp = new ArrayList<>();
        for (User user: this.nachrichten.keySet()) {
            for (Message message:this.nachrichten.get(user)) {
                temp.add(message);
            }
        }

        return temp;
    }
    public List<Message> getAllMessagesFromUser(User user){
        List<Message> temp = new ArrayList<>();
        for (Message message : this.nachrichten.get(user)) {
            temp.add(message);
        }
        return temp;
    }

    public List<Message> getAllMessagesFromDate(String date){
        List<Message> temp = new ArrayList<>();
        for (Map.Entry<User, List<Message>> message:this.nachrichten.entrySet()) {


            }


        return temp;
    }

    public void toString(List<Message> messages){
        for (Message message: messages) {
            System.out.println(message.getMessage() + "," + message.getCreationDate());
        }
    }
}

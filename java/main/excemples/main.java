package main.excemples;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        UserManager userManager = new UserManager();
        List<User> userList = new ArrayList<User>();
        List<User> userList1;
        User u1 = new User("u1","p1");
        User u2 = new User("u1","p1");
        userList.add(u1);
        userList.add(u2);
        userManager.serialize(userList);
        TwotterSystem twitter = new TwotterSystem();
        twitter.addMessage(u1,new Message("Hallo"));
        twitter.addMessage(u1,new Message("Hallo2"));
        twitter.addMessage(u1,new Message("Hallo3"));
        List<Message> messageList = twitter.getAllMessages();
        System.out.println(messageList.get(0).getMessage());
        System.out.println(messageList.get(1).getMessage());
        System.out.println(messageList.get(2).getMessage());
        messageList = twitter.getAllMessagesFromUser(u1);
        System.out.println(messageList.get(0).getMessage());
        System.out.println(messageList.get(1).getMessage());
        System.out.println(messageList.get(2).getMessage());
        messageList = twitter.getAllMessagesFromDate("1.1.1.1");
        System.out.println(messageList.get(0).getMessage());
        System.out.println(messageList.get(1).getMessage());
        System.out.println(messageList.get(2).getMessage());


        //System.out.println(twitter.getAllMessages());
    }
}

package main.pruefungsvorbereitung.aufgabe1;

import main.pruefungsvorbereitung.aufgabe2.Message;
import main.pruefungsvorbereitung.aufgabe2.TwotterSystem;
import main.pruefungsvorbereitung.aufgabe3.DownloadManager;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) throws Exception {
        User ivan = new User("Ivan","password");
        User annika =new User("Annika","Password");
        User hans =new User("hans","Password");
        User dieter =new User("dieter","Password");
        User zimmerman =new User("Zimmermann","Password");
        UserManager um = new UserManager();

        List<User> users = new ArrayList<>();
        users.add(ivan);
        users.add(annika);
        users.add(hans);
        users.add(dieter);
        users.add(zimmerman);

        Collections.sort(users);
        um.serialize(users);
        List<User> test = new ArrayList<>();
        test = um.deserialize();

        for (User u:test) {
            System.out.println(u.getBenutzername()+" "+ "PW:" + u.getPassword() );


        }

        Message hello = new Message("Hello");
        Message world = new Message("World");

        TwotterSystem twotterSystem = new TwotterSystem();
        twotterSystem.addUser(ivan);
        twotterSystem.addUser(annika);
        twotterSystem.addMessages(ivan, world);
        twotterSystem.addMessages(ivan, hello);
        twotterSystem.addMessages(annika, hello);
        twotterSystem.addMessages(annika, world);
        twotterSystem.getAllMessagesFromUser(ivan);
        twotterSystem.toString(twotterSystem.getAllMessagesFromUser(ivan));
        twotterSystem.toString(twotterSystem.getAllMessages());
        twotterSystem.toString(twotterSystem.getAllMessagesFromDate("04.07.2020"));

        URL url = new URL("http://example.com/resource ");
        DownloadManager downloadManager = new DownloadManager().specifyDownloadLocation(url).configure(3,1200);
        System.out.println(downloadManager.startDownload());
    }
}

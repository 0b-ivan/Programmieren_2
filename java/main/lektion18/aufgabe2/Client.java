package main.lektion18.aufgabe2;

import java.net.Socket;
import java.io.*;
import java.net.SocketException;

public class Client {
    String nachricht;



    public static void main(String[] args) throws Exception {
        Client client = new Client();
        try { client.binder();}
        catch (IOException e) { e.printStackTrace(); }
    }
    void binder() throws Exception {
        final String ip = "127.0.0.1"; // localhost
        final int port = 11111;
        System.out.println("Verbinde mit Server...");
       try (java.net.Socket socket= new java.net.Socket(ip, port);) {//verbindet sich mit Server
           Messenger.sendMessage(socket, "#CT#");
           nachricht = Messenger.readMessage(socket);
           switcher(socket);
           return;
       }
       catch (SocketException e){
           if (e.getMessage() == "Socket closed"){
               binder();
           }
       }
    }



    private void switcher(Socket socket) throws Exception {

        while (true) {
            switch (nachricht) {
                case "#CTC#":
                    System.out.println("Mit Server Verbunden...");

                    nachricht = "#GO#";
                    switcher(socket);
                /*case "recived:#ENDE#":
                    System.out.println("Mit Server Verbindung geschlossen...");
                    socket.close();
                    break;*/
                case "#GO#":
                    Messenger.sendMessage(socket,"#GO#");
                    System.out.println("Starte austausch;");
                    Hangman first = new Hangman();
                    while(nachricht!="#false#") {
                        first.tryCase('a', 3);

                        nachricht = "#false#";
                    }
                    break;
                default:
                    System.out.println("Keine Verbindung möglich");
                    socket.close();
                    binder();
                    break;
            }
        }
    }
}


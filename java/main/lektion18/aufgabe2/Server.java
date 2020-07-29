
package main.lektion18.aufgabe2;

// Server.java

import main.lektion16.aufgabe3.Object;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    String nachricht;
    int cnt =0;


    public static void main(String[] args) {
        Server server = new Server();
        try { server.gameServerSocket(); }
        catch (IOException e) { e.printStackTrace();}
    }

    private void gameServerSocket() throws IOException {
        int port = 11111;
        java.net.ServerSocket serverSocket = new java.net.ServerSocket(port);
        java.net.Socket client = LoginwaitRequest(serverSocket);
        System.out.println("Client request...");
        nachricht = Messenger.readMessage(client);
        switcher(serverSocket, client);
        return;
    }

    private java.net.Socket LoginwaitRequest(java.net.ServerSocket serverSocket) throws IOException {
        java.net.Socket socket = serverSocket.accept(); // blockiert, bis sich ein Client angemeldet hat
        return socket;
    }

    private void switcher(ServerSocket serverSocket, Socket client) throws IOException {
        while (true) {
            cnt++;
            System.out.println("request:"+cnt);
            switch (nachricht){
                case "#CT#":
                    System.out.println("sending answer...");
                    Messenger.sendMessage(client,"#CTC#");
                    nachricht = Messenger.readMessage(client);
                    break;
                /*case "#END#":
                    serverSocket.close();
                    gameServerSocket();
                    break;*/
                case "#GO#":


                    nachricht = "#GO#";
                    break;
                default:
                    break;
            }

        }
    }




}




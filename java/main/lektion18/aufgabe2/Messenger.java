package main.lektion18.aufgabe2;

import main.lektion16.aufgabe3.Object;

import java.io.*;

public class Messenger {



    static void sendMessage(java.net.Socket socket, String answer) throws IOException {
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        printWriter.print(answer);
        System.out.println("M:answer:" + answer);
        printWriter.flush();
    }
    static void sendData(java.net.Socket socket, Object object) throws IOException {
        try(ObjectOutputStream oos= new ObjectOutputStream(socket.getOutputStream());) {
            System.out.println("M:answer:" + object.getClass());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    static ObjectInputStream readData(java.net.Socket socket) throws IOException {
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        System.out.println("M:Request:"+ois);
        return ois;
    }

    static String readMessage(java.net.Socket socket) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        char[] buffer = new char[200];
        int anzahlZeichen = bufferedReader.read(buffer, 0, 200); // blockiert bis Nachricht empfangen
        if(anzahlZeichen <= 0) return "#END#";
        String inBox = new String(buffer, 0, anzahlZeichen);
        System.out.println("M:Request:"+inBox);
        return inBox;
    }
}

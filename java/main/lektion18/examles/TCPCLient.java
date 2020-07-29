package main.lektion18.examles;

import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;


public class TCPCLient {
    public static void main(String[] args){
        final int PORT = 80;
        final String HOST = "https://google.de";
        try (Socket connectionToServer = new Socket(HOST, PORT);
             OutputStream os = connectionToServer.getOutputStream();)
        {
            os.write("Suppe mit dem Löffel löffeln".getBytes());
            os.write("Suppe mit dem Löffel löffeln".getBytes(StandardCharsets.ISO_8859_1));
            os.write("Suppe mit dem Löffel löffeln".getBytes(StandardCharsets.UTF_16));
            os.write("Suppe mit dem Löffel löffeln".getBytes(StandardCharsets.UTF_8));
            os.write("Suppe mit dem Löffel löffeln".getBytes(StandardCharsets.US_ASCII));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

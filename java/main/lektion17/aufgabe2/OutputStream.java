package main.lektion17.aufgabe2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class OutputStream {


    public static void copyFileWithErrorHandling() {
        InputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("pic.jpg");
            fos = new FileOutputStream("copy.jpg");
            int b;

            do {
                b = fis.read();
                if (b != -1) fos.write(b);
            }
            while (b != -1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
            }
        }
    }




}


package main.lektion14;
import javax.management.RuntimeErrorException;


public class Punkt {
    int x;
    int y;

     public void verschiebePunkt(int zielX, int zielY){
         if ((zielX<0) || (zielY < 0)) throw new RuntimeException("PUNKT_NEGATIV");
         if (zielX>1920) throw new RuntimeException("X darf nicht Groesser 1920 sein");
         if (zielY>1080) throw new RuntimeException("Y darf nicht Groesser 1080 sein");
         x = zielX;
         y = zielY;
     }

}

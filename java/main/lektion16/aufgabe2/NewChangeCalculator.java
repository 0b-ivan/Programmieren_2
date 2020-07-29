package main.lektion16.aufgabe2;

public class NewChangeCalculator implements ChangeCalculator {

    public int[] getChange(int euros, int cent) {
        int[] ausgabe = new int[8];
        int counter = 0;
        euros+= cent/100;
        ausgabe[7] = euros/2;
        ausgabe[6] = euros%2;
        cent%=100;
        ausgabe[5] = cent/50;
        cent%=50;
        ausgabe[4] = cent/20;
        cent%=20;
        ausgabe[3] = cent/10;
        cent%=10;
        ausgabe[2] = cent/5;
        cent%=5;
        ausgabe[1] = cent/2;
        cent%=2;
        ausgabe[0] = cent/1;

        for (int coin:ausgabe) {
            counter++;
        }
        Coin[] ausgabe2 = new Coin[counter];
        

        return ausgabe;

    }

}

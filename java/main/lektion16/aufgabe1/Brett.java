package main.lektion16.aufgabe1;

public class Brett
{
  boolean[][] brett = new boolean[8][8];
  
  public Brett()
  {
    
  }
  
  public void markiereFeld(int x, int y)
  {
    brett[x-1][y-1] = true;
  }

  public Brett kombiniere(Brett uebergeben){  //übergebenes Brett
    Brett kombiniert = new Brett();   //neues Brett erstellen
    for (int i = 1; i <= 8; i++){
      for (int j = 1; j <= 8; j++){
        //wenn das übergebene brett "uebergeben" oder das aktuelle brett "brett" ein markiertes Feld hat...
        if((uebergeben.gibFeld(i, j) || brett[i-1][j-1]) == true) kombiniert.markiereFeld(i, j); //..wird dieses auf dem neuen Brett "kombiniert" markiert
      }
    } return kombiniert;
  }
  public boolean gibFeld(int x, int y)
  {
    return brett[x-1][y-1];
  }
  
}

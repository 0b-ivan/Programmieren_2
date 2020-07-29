package main.lektion16.aufgabe4;


import java.util.ArrayList;

//Klasse zum Upload ins e-learning
@SuppressWarnings("all")
public  class StackVererbung extends ArrayList {



  public void push(Object o){
    add(o);
  }

  public void pop(){
    remove(size());
  }






}

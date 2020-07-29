package main.pruefungsvorbereitung.aufgabe1;

import java.io.Serializable;

public class User implements Serializable, Comparable {
    private final String benutzername;
    private final transient String password;

    public User(String benutzername,String password){
        this.benutzername = benutzername;
        this.password = password;
    }

    @Override
    public int compareTo(Object o){
        User other = (User) o;
        return this.benutzername.compareTo(other.benutzername);
    }

    public String getBenutzername(){
        return this.benutzername;
    }
    public String getPassword(){
       try{
           this.password.isEmpty();
           return "da";
       }
       catch (NullPointerException e){
           return "kein Password";
       }
    }

}

package main.excemples;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

public class User implements Serializable,Comparable<User> {

    private String username;
    private transient String password;

    public User(){}

    public User(String username,String password){
        this.username = username;
        this.password = password;
    }

    @Override
    public int compareTo(User u) {
        return this.username.compareTo(u.username);
    }
    @Override
    public String toString(){
        return this.username;
    }
}

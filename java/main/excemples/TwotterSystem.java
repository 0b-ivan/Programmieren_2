package main.excemples;

import main.lektion16.aufgabe3.Object;

import java.util.*;

public class TwotterSystem{
    Map<User,List<Message>> userMessageMap = new HashMap<>();

    public void addMessage(User user,Message message){
            List<Message> tmpMsg = new ArrayList<>();
            if((userMessageMap.containsKey(user))) tmpMsg = this.userMessageMap.get(user);
            tmpMsg.add(message);
            this.userMessageMap.put(user, tmpMsg);


    }
    public List<Message> getAllMessages(){
        List<Message> tmpLst = new ArrayList<>();
        for (List<Message> ml:this.userMessageMap.values()){
            for (Message m:ml){
                tmpLst.add(m);
            }
        }
        return tmpLst;
    }
    public List<Message> getAllMessagesFromUser(User user) { return userMessageMap.get(user); }

    public List<Message> getAllMessagesFromDate(String date){
        List<Message> tmplist = new ArrayList<>();
        for(List<Message> ml:this.userMessageMap.values()){
            for(Message m : ml){
                if(m.getCreationDate() == date) tmplist.add(m);
            }
        }
        return tmplist;
    }



    }





package main.excemples;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserManager implements ObjectMangager <User> {



   @Override
    public void serialize(List<User> object) throws RuntimeException  {
        try(ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("User.dat"));) {
            for (User u:object) {
                oos.writeObject(u);
                oos.flush();
            }
        oos.writeObject(object);
        }
        catch (Exception e){ throw new RuntimeException(); }

    }

   @Override
    public List<User> deserialize()throws RuntimeException {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("User.dat"))){
            ArrayList<User> users = new ArrayList<>();
            Object user;
            User test;
            while (true){
                user = ois.readObject();
                test = (User) user;
                if(user.equals(null)) break;
                else {
                    users.add(test);
                }
            }
            return users;

        }
        catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException();}
    }
}

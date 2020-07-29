package main.pruefungsvorbereitung.aufgabe1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class UserManager implements ObjectManager<User> {
    @Override
    public void serialize(List<User> users) throws RuntimeException {
        try {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.dat"));
             oos.writeObject(users);
             oos.close();

        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<User> deserialize() {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.dat"));){
           return (List) ois.readObject();
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}

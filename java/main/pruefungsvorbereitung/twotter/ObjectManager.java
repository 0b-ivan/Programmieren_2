package main.pruefungsvorbereitung.twotter;

import java.util.List;

public interface ObjectManager <T> {

    public void serialize(List<T> objct);
    public List<T> deserialize();

}

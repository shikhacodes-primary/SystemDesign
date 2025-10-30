package DesignPatterns.MementoDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class CaretakerMemento {
    List<Memento> history = new ArrayList<>();

    public void addMemento(Memento memento) {
        history.add(memento);
    }

    public Memento undo() {
        if (!history.isEmpty()) {
           int index = history.size() - 1;
           Memento memento = history.get(index);
           history.remove(index);
           return memento;
        }
        return null;
    }
}

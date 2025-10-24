package DesignPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableInterfaceImpl implements ObservableInterface {
    int data = 20;
    private static List<ObserverInterface> observers = new ArrayList<>();
    @Override
    public void addObserver(ObserverInterface observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ObserverInterface observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (ObserverInterface observer : observers) {
            observer.update();
        }
    }

    @Override
    public void setData(int newData) {
        data += newData;
        notifyObservers();
    }

    @Override
    public int getData() {
        return data;
    }

}

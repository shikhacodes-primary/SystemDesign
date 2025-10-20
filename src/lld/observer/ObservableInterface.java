package lld.observer;

public interface ObservableInterface {
    void addObserver(ObserverInterface observer);
    void removeObserver(ObserverInterface observer);
    void notifyObservers();
    void setData(int newData);
    int getData();
}

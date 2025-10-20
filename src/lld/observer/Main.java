package lld.observer;

public class Main {
    public static void main(String[] args) {
        ObservableInterface observable = new ObservableInterfaceImpl();

        ObserverInterface observer1 = new ObserverInterfaceImpl("xyz@gmail.com", observable);
        ObserverInterface observer2 = new ObserverInterfaceImpl("xyz2@gmail.com", observable);

        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.setData(20);
    }
}

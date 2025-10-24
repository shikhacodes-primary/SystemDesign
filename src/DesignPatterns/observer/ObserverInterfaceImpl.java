package DesignPatterns.observer;

public class ObserverInterfaceImpl implements ObserverInterface {
    String emailOfObserver;
    ObservableInterface observable;

    public ObserverInterfaceImpl(String emailOfObserver, ObservableInterface observable) {
        this.emailOfObserver = emailOfObserver;
        this.observable = observable;
    }

    @Override
    public void update() {
        int data = observable.getData();
        System.out.println("Observer with email:: " + emailOfObserver + " is updated:: " + data);
    }
}

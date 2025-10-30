package DesignPatterns.MementoDesignPattern;

public class Main {
    public static void main(String[] args) {
        CaretakerMemento caretakerMemento = new CaretakerMemento();
        ConfigurationOriginator originator = new ConfigurationOriginator(2,4);
        Memento snapshot1 = originator.createMemento();
        caretakerMemento.addMemento(snapshot1);
        System.out.println("Added first:: " + "height:: " + originator.getHeight() + " width:: " + originator.getWidth());

        originator.setHeight(4);
        originator.setWidth(8);
        Memento snapshot2 = originator.createMemento();
        caretakerMemento.addMemento(snapshot2);
        System.out.println("Modified:: " + "height:: " + originator.getHeight() + " width:: " + originator.getWidth());

        originator.setHeight(40);
        originator.setWidth(80);
        System.out.println("Before Undo:: " + "height:: " + originator.getHeight() + " width:: " + originator.getWidth());

        Memento restoreMemento = caretakerMemento.undo();
        originator.restoreMemento(restoreMemento);

        System.out.println("After restore:: " + "height:: " + originator.getHeight() + " width:: " + originator.getWidth());
    }
}

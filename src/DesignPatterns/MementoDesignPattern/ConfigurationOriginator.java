package DesignPatterns.MementoDesignPattern;

public class ConfigurationOriginator {
    int height;
    int width;

    public ConfigurationOriginator(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Memento createMemento() {
        return new Memento(this.height, this.width);
    }

    public void restoreMemento(Memento memento) {
        this.height = memento.height;
        this.width = memento.width;
    }
}

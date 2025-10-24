package DesignPatterns.Decorator;

public class MargherittaPizza implements BasePizza {

    @Override
    public String getDescription() {
        return "Margheritta pizza";
    }

    @Override
    public double getPrice() {
        return 20;
    }
}

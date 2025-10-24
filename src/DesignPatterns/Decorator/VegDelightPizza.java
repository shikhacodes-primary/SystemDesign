package DesignPatterns.Decorator;

public class VegDelightPizza implements BasePizza {
    @Override
    public String getDescription() {
        return "Veg delight Pizza";
    }

    @Override
    public double getPrice() {
        return 40;
    }
}

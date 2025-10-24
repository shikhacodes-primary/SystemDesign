package DesignPatterns.Decorator;

public class CheeseTopping extends ToppingsDecorator {
    public CheeseTopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription() + " with extra cheese";
    }

    @Override
    public double getPrice() {
        return basePizza.getPrice() + 20;
    }
}

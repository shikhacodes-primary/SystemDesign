package LowLevelDesign.Decorator;

public abstract class ToppingsDecorator implements BasePizza{
    BasePizza basePizza;

    public ToppingsDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription();
    }

    @Override
    public double getPrice() {
        return basePizza.getPrice();
    }
}

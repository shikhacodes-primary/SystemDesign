package LowLevelDesign.Decorator;

public class PaneerTopping extends ToppingsDecorator{
    public PaneerTopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription() + " with Paneer";
    }

    @Override
    public double getPrice() {
        return basePizza.getPrice() + 50;
    }
}

package DesignPatterns.Decorator;

public class Client {
    public static void main(String[] args) {
        BasePizza pizza1 = new MargherittaPizza();
        System.out.println("Order 1:: " + pizza1.getDescription() + ", Price:: " + pizza1.getPrice());

        BasePizza pizza2 = new CheeseTopping(new MargherittaPizza());
        System.out.println("Order 2:: " + pizza2.getDescription() + ", Price:: " + pizza2.getPrice());

        BasePizza pizza3 = new VegDelightPizza();
        System.out.println("Order 3:: " + pizza3.getDescription() + ", Price:: " + pizza3.getPrice());

        BasePizza pizza4 = new PaneerTopping(new VegDelightPizza());
        System.out.println("Order 4:: " + pizza4.getDescription() + ", Price:: " + pizza4.getPrice());

    }
}

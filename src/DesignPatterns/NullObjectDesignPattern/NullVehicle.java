package DesignPatterns.NullObjectDesignPattern;

public class NullVehicle implements Vehicle {
    @Override
    public int getSeatingCapacity() {
        return 0;
    }

    @Override
    public int getFuelCapacity() {
        return 0;
    }
}

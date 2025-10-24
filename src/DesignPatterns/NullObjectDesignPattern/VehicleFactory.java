package DesignPatterns.NullObjectDesignPattern;

public class VehicleFactory {
    static Vehicle getVehicle(String type) {
        if (type.equals("CAR")) {
            return new Car();
        }
        return new NullVehicle(); // in place of return null;
    }
}

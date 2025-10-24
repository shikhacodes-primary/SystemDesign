package LowLevelDesign.NullObjectDesignPattern;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = VehicleFactory.getVehicle("Bike");
        printVehicleDetails(vehicle);

    }

    private static void printVehicleDetails(Vehicle vehicle) {

//        if (vehicle != null) {
//            System.out.println("Fuel Capacity :: " + vehicle.getFuelCapacity());
//            System.out.println("Seating Capacity :: " + vehicle.getSeatingCapacity());
//        }
        System.out.println("Fuel Capacity :: " + vehicle.getFuelCapacity());
        System.out.println("Seating Capacity :: " + vehicle.getSeatingCapacity());
    }
}

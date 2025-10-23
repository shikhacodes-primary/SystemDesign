package LowLevelDesign.ParkingLot;

public class TwoWheelerParkingSpot extends ParkingSpot {

    public TwoWheelerParkingSpot(int parkingSpotId, Vehicle vehicle, boolean isEmpty, double price) {
        super(parkingSpotId, vehicle, isEmpty, price);
    }

    public double setPrice() {
        return 300;
    }
}

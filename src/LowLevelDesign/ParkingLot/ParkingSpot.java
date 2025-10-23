package LowLevelDesign.ParkingLot;

public class ParkingSpot {
    private int parkingSpotId;
    private Vehicle vehicle;
    private boolean isEmpty;
    private double price;

    public ParkingSpot(int parkingSpotId, Vehicle vehicle, boolean isEmpty, double price) {
        this.parkingSpotId = parkingSpotId;
        this.vehicle = vehicle;
        this.isEmpty = isEmpty;
        this.price = price;
    }

    public int getParkingSpotId() {
        return parkingSpotId;
    }

    public void setParkingSpotId(int parkingSpotId) {
        this.parkingSpotId = parkingSpotId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

package LowLevelDesign.ParkingLot;

import java.util.List;
import java.util.stream.Collectors;

public class ParkingSpotManager {
    List<ParkingSpot> parkingSpots;

    public ParkingSpotManager(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public List<ParkingSpot> getEmptyParkingSpotsByVehicleType(Vehicle vehicle) {
        return parkingSpots.stream().filter(ParkingSpot::isEmpty)
                .filter(x -> x.getVehicle().getVehicleType() == vehicle.getVehicleType())
                .collect(Collectors.toList());
    }
}

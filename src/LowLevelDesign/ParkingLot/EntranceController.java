package LowLevelDesign.ParkingLot;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public class EntranceController {

    Entrance entrance;
    ParkingSpotManager parkingSpotManager;

    public ParkingSpot findParkingSpot(Vehicle vehicle) {
        List<ParkingSpot> emptyParkingSpots = parkingSpotManager.getEmptyParkingSpotsByVehicleType(vehicle);
        if(!emptyParkingSpots.isEmpty()) {
            return emptyParkingSpots.get(0);
        } else {
            return null;
        }
    }

    public ParkingSpot updateParkingSpot(ParkingSpot spot, Vehicle vehicle) {
        spot.setEmpty(false);
        spot.setVehicle(vehicle);
        return spot;
    }

    public Ticket generateTicket(ParkingSpot parkingSpot) {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(OffsetDateTime.now());
        ticket.setParkingSpot(parkingSpot);
        return ticket;
    }

}

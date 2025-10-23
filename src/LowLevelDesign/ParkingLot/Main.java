package LowLevelDesign.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        initializeParkingLot();
    }

    private static void initializeParkingLot() {
        List<ParkingSpot> parkingSpots = new ArrayList<>();
        ParkingSpot parking1 = new ParkingSpot(1, null, true, 200);
    }
}

import java.util.ArrayList;
import java.util.Collections;

public class DockingStation {

    ArrayList<Bike> dockedBikes = new ArrayList<Bike>();

    int capacity = 5;

    public int getCapacity() {
        return capacity;
    }

    public void dockBike (Bike bike) throws CapacityFullException {
        if (dockedBikes.size() < 5) {
            dockedBikes.add(bike);
        } else {
            throw new CapacityFullException("Docking station capacity full.");
        }
    }

    public void releaseBike () throws DockingStationEmptyException, BikeIsBrokenException {
        System.out.println(dockedBikes);
        Collections.shuffle(dockedBikes);
        System.out.println(dockedBikes);
        if (dockedBikes.size() == 0) {
            throw new DockingStationEmptyException("Docking station is empty.");

        } else if (dockedBikes.get(dockedBikes.size() - 1).getCondition() == "broken") {
            throw new BikeIsBrokenException("This bike is broken and cannot be released");
        } else {
            dockedBikes.remove(dockedBikes.size() - 1);
        }
    }

}

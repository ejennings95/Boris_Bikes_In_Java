import java.util.ArrayList;

public class DockingStation {

    ArrayList<Object> dockedBikes = new ArrayList<Object>();

    int capacity = 5;

    public int getCapacity() {
        return capacity;
    }

    public void dockBike (Object bike) throws CapacityFullException {
        if (dockedBikes.size() < 5) {
            dockedBikes.add(bike);
        } else {
            throw new CapacityFullException("Docking station capacity full.");
        }
    }

    public void releaseBike () throws DockingStationEmptyException {
        if (dockedBikes.size() == 0) {
            throw new DockingStationEmptyException("Docking station is empty.");

        } else {
            dockedBikes.remove(dockedBikes.size() - 1);
        }
    }

}

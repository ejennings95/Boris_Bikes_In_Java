import java.util.ArrayList;

public class DockingStation {

    ArrayList<Object> dockedBikes = new ArrayList<Object>();

    int capacity = 5;

    public int getCapacity() {
        return capacity;
    }

    public void dockBike (Object bike) throws CapacityFullException {
        if (dockedBikes.size() <= 5) {
            dockedBikes.add(bike);
        } else {
            System.out.println("here");
            throw new CapacityFullException("Docking station capacity full.");
        }
    }

    public void releaseBike () {
        dockedBikes.remove(dockedBikes.size() - 1);
    }

}

import java.util.ArrayList;

public class DockingStation {

    ArrayList<Object> dockedBikes = new ArrayList<Object>();

    public void dockBike (Object bike) {
        dockedBikes.add(bike);
    }
}

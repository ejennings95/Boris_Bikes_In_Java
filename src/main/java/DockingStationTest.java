import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DockingStationTest {

    @DisplayName("should start with dockedbikes equating to an empty array")
    @Test
    void dockedBikesArray() {
        DockingStation dockingStation = new DockingStation();
        assertEquals(new ArrayList<Object>(), dockingStation.dockedBikes);
    }


    @DisplayName("should be possible to dock a bike")
    @Test
    void dockBike() {
        DockingStation dockingStation = new DockingStation();
        Object bike = Mockito.spy(Bike.class);
        dockingStation.dockBike(bike);
        assertEquals(bike, dockingStation.dockedBikes.get(0));
    }


    @DisplayName("should be possible to release a bike")
    @Test
    void releaseBike() {
        DockingStation dockingStation = new DockingStation();
        Object bike = Mockito.spy(Bike.class);
        dockingStation.dockBike(bike);
        dockingStation.releaseBike();
        assertEquals(0, dockingStation.dockedBikes.size());
    }


    @DisplayName("default capacity is 5 bikes")
    @Test
    void getCapacity() {
        DockingStation dockingStation = new DockingStation();
        assertEquals(5, dockingStation.getCapacity());
    }
}
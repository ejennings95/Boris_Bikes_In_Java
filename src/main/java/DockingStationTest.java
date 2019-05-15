import org.junit.Rule;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DockingStationTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @DisplayName("should start with dockedbikes equating to an empty array")
    @Test
    void dockedBikesArray() {
        DockingStation dockingStation = new DockingStation();
        assertEquals(new ArrayList<Object>(), dockingStation.dockedBikes);
    }


    @DisplayName("should be possible to dock a bike")
    @Test
    void dockBike() throws CapacityFullException {
        DockingStation dockingStation = new DockingStation();
        Object bike = Mockito.spy(Bike.class);
        dockingStation.dockBike(bike);
        assertEquals(bike, dockingStation.dockedBikes.get(0));
    }


    @DisplayName("should be possible to release a bike")
    @Test
    void releaseBike() throws CapacityFullException {
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


    @DisplayName("cannot dock bike if docking station at capacity")
    @Test
    void dockBikeFullCapacity() throws CapacityFullException {
        DockingStation dockingStation = new DockingStation();
        Object bike = Mockito.spy(Bike.class);
        Object bike1 = Mockito.spy(Bike.class);
        Object bike2 = Mockito.spy(Bike.class);
        Object bike3 = Mockito.spy(Bike.class);
        Object bike4 = Mockito.spy(Bike.class);
        Object bike5 = Mockito.spy(Bike.class);
        dockingStation.dockBike(bike);
        dockingStation.dockBike(bike1);
        dockingStation.dockBike(bike2);
        dockingStation.dockBike(bike3);
        dockingStation.dockBike(bike4);
        dockingStation.dockBike(bike5);
        assertEquals(5, dockingStation.getCapacity());
    }
}
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DockingStationTest {

    @DisplayName("should start with dockedbikes equating to an empty array")
    @Test
    void dockedBikesArray() {
        DockingStation dockingStation = new DockingStation();
        assertArrayEquals(new String[]{}, dockingStation.dockedBikes);
    }

}
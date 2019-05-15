import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {

    @DisplayName("bike should start in working condition")
    @Test
    void condition() {
        Bike bike = new Bike();
        assertEquals("working", bike.getCondition());
    }

}
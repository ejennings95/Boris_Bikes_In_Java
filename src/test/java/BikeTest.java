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

    @DisplayName("bike condition can be set as broken")
    @Test
    void conditionBroken() {
        Bike bike = new Bike();
        bike.isBroken();
        assertEquals("broken", bike.getCondition());
    }

    @DisplayName("bike condition can be set as working when fixed")
    @Test
    void conditionWorking() {
        Bike bike = new Bike();
        bike.isBroken();
        bike.isWorking();
        assertEquals("working", bike.getCondition());
    }

}
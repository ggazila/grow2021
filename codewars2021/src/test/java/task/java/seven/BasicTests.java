package task.java.seven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BasicTests {
    @Test
    public void basicTestCases() {
        assertEquals(6, CodeWars.overTheRoad(1, 3));
        assertEquals(4, CodeWars.overTheRoad(3, 3));
        assertEquals(5, CodeWars.overTheRoad(2, 3));
        assertEquals(8, CodeWars.overTheRoad(3, 5));
        assertEquals(16, CodeWars.overTheRoad(7, 11));
    }
}

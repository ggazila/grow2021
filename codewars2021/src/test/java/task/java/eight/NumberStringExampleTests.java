package task.java.eight;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberStringExampleTests {

    @Test
    public void tests() {
        assertEquals("67", Kata2.numberToString(67));
        assertEquals("167", Kata2.numberToString(167));
        assertEquals("22", Kata2.numberToString(22));
    }
}

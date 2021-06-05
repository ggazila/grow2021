package task.java.seven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KataTest1 {
    @Test
    public void test1() {
        assertEquals("42 -9", Kata1.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}

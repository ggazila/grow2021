package task.java.six;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AreSameTest {

    @Test
    public void test1() {
        int[] a = new int[] { 0, -14, 191, 161, 19, 144, 195, 1 };
        int[] b = new int[] { 1, 0, 196, 36481, 25921, 361, 20736, 38025 };
        assertEquals(true, AreSame.comp(a, b));
    }
}

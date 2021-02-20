package task.seven;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AbundantTests {

    @Test
    public void testAbundant() {
        assertTrue(Kata3.abundantNumber(12));
        assertTrue(Kata3.abundantNumber(18));
    }

    @Test
    public void testNonAbundant() {
        assertFalse(Kata3.abundantNumber(37));
        assertFalse(Kata3.abundantNumber(77));
    }

}

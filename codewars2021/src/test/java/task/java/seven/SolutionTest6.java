package task.java.seven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest6 {

    @Test
    public void simpleArray1() {
        assertEquals(2, getActualFor(1, 1, 2));
    }

    @Test
    public void simpleArrayBetter() {
        assertEquals(2, getActualFor(1, 1, 2));
    }

    private int getActualFor(int... numbers) {
        return Solution6.stray(numbers);
    }
}

package task.seven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest2 {

    @Test
    public void simpleArray1() {
        assertEquals(2, getActualFor(1, 1, 2));
    }

    private int getActualFor(int... numbers) {
        return Solution2.stray(numbers);
    }
}

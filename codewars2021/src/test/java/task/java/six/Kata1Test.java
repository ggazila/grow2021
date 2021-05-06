package task.java.six;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Kata1Test {
    @Test
    public void sampleTests() {
        assertArrayEquals(new int[] { 2 },
                Kata1.arrayDiff(new int[] { 1, 2 }, new int[] { 1 }));
        assertArrayEquals(new int[] { 2, 2 },
                Kata1.arrayDiff(new int[] { 1, 2, 2 }, new int[] { 1 }));
        assertArrayEquals(new int[] { 1 },
                Kata1.arrayDiff(new int[] { 1, 2, 2 }, new int[] { 2 }));
        assertArrayEquals(new int[] { 1, 2, 2 },
                Kata1.arrayDiff(new int[] { 1, 2, 2 }, new int[] {}));
        assertArrayEquals(new int[] {},
                Kata1.arrayDiff(new int[] {}, new int[] { 1, 2 }));
    }

    @Test
    public void sampleTests2() {
        assertArrayEquals(new int[] { 2 },
                Kata1.arrayDiff2(new int[] { 1, 2 }, new int[] { 1 }));
        assertArrayEquals(new int[] { 2, 2 },
                Kata1.arrayDiff2(new int[] { 1, 2, 2 }, new int[] { 1 }));
        assertArrayEquals(new int[] { 1 },
                Kata1.arrayDiff2(new int[] { 1, 2, 2 }, new int[] { 2 }));
        assertArrayEquals(new int[] { 1, 2, 2 },
                Kata1.arrayDiff2(new int[] { 1, 2, 2 }, new int[] {}));
        assertArrayEquals(new int[] {},
                Kata1.arrayDiff2(new int[] {}, new int[] { 1, 2 }));
    }

}

package task.java.six;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Kata2Test {
    @Test
    public void exampleTest1() {
        assertArrayEquals(new int[] { 1, 3, 2, 8, 5, 4 },
                Kata2.sortArray(new int[] { 5, 3, 2, 8, 1, 4 }));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new int[] { 1, 3, 5, 8, 0 },
                Kata2.sortArray(new int[] { 5, 3, 1, 8, 0 }));
    }

    @Test
    public void exampleTest3() {
        assertArrayEquals(new int[] {}, Kata2.sortArray(new int[] {}));
    }

    @Test
    public void exampleTest4() {
        assertArrayEquals(new int[] { 1, 3, 2, 8, 5, 4 },
                Kata2.sortArray2(new int[] { 5, 3, 2, 8, 1, 4 }));
    }

    @Test
    public void exampleTest5() {
        assertArrayEquals(new int[] { 1, 3, 5, 8, 0 },
                Kata2.sortArray2(new int[] { 5, 3, 1, 8, 0 }));
    }

    @Test
    public void exampleTest6() {
        assertArrayEquals(new int[] {}, Kata2.sortArray2(new int[] {}));
    }

}

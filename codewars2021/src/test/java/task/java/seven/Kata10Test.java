package task.java.seven;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// TODO: Replace examples and use TDD by writing your own tests

class Kata10Test {
    @Test
    void isArray() {
        assertEquals(int[].class,
                Kata10.multiplyAll(new int[] { 1 }).apply(1).getClass());
    }

    @Test
    void hasCorrectLength() {
        assertEquals(2, Kata10.multiplyAll(new int[] { 1, 2 }).apply(1).length);
    }

    @Test
    void basicTests() {
        assertArrayEquals(new int[] { 1, 2, 3 },
                Kata10.multiplyAll(new int[] { 1, 2, 3 }).apply(1));
        assertArrayEquals(new int[] { 2, 4, 6 },
                Kata10.multiplyAll(new int[] { 1, 2, 3 }).apply(2));
        assertArrayEquals(new int[] { 0, 0, 0 },
                Kata10.multiplyAll(new int[] { 1, 2, 3 }).apply(0));
        assertArrayEquals(new int[0], Kata10.multiplyAll(new int[0]).apply(10),
                "should return an empty array");
    }
}

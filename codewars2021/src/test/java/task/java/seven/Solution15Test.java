package task.java.seven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Solution15Test {

    @Test
    public void test1() {
        int[] array = new int[]{1, 2};
        assertEquals("yes, ascending", Solution15.isSortedAndHow(array));
    }

    @Test
    public void test2() {
        int[] array = new int[]{15, 7, 3, -8};
        assertEquals("yes, descending", Solution15.isSortedAndHow(array));
    }

    @Test
    public void test3() {
        int[] array = new int[]{4, 2, 30};
        assertEquals("no", Solution15.isSortedAndHow(array));
    }

}

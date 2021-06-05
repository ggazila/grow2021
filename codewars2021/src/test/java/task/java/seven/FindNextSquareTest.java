package task.java.seven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindNextSquareTest {
    @Test
    public void test1() {
        assertEquals(144, NumberFun.findNextSquare(121));
    }

    @Test
    public void test2() {
        assertEquals(676, NumberFun.findNextSquare(625));
    }

    @Test
    public void test3() {
        assertEquals(-1, NumberFun.findNextSquare(114));
    }

    @Test
    public void test4() {
        assertEquals(15241630849L, NumberFun.findNextSquare(15241383936L));
    }
}

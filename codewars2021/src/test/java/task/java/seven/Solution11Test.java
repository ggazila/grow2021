package task.java.seven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// TODO: Replace examples and use TDD development by writing your own tests

public class Solution11Test {
    @Test
    public void BasicTests() {

        assertEquals(true, Kata11.CheckIfFlush(
                new String[] { "AS", "3S", "9S", "KS", "4S" }));
        assertEquals(false, Kata11.CheckIfFlush(
                new String[] { "AD", "4S", "7H", "KC", "5S" }));
        assertEquals(false, Kata11.CheckIfFlush(
                new String[] { "AD", "4S", "10H", "KC", "5S" }));
        assertEquals(true, Kata11.CheckIfFlush(
                new String[] { "QD", "4D", "10D", "KD", "5D" }));
    }

}

package task.java.seven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest7 {
    @Test
    public void basicTests() {
        assertEquals("Lew", Kata7.declareWinner(new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 4), "Lew"));
        assertEquals("Harry", Kata7.declareWinner(new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", Kata7.declareWinner(new Fighter("Harald", 20, 5),
                new Fighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", Kata7.declareWinner(new Fighter("Harald", 20, 5),
                new Fighter("Harry", 5, 4), "Harald"));
        assertEquals("Harald", Kata7.declareWinner(new Fighter("Jerry", 30, 3),
                new Fighter("Harald", 20, 5), "Jerry"));
        assertEquals("Harald", Kata7.declareWinner(new Fighter("Jerry", 30, 3),
                new Fighter("Harald", 20, 5), "Harald"));
    }
}

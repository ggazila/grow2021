package task.java.seven;

import static codewars.thirtyonemay.seven.Solution16.capitalize;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Solution16Test {
    @Test
    public void basicTest() {
        assertEquals("aBCdeF", capitalize("abcdef", new int[]{1, 2, 5}));
        assertEquals("aBCdeF", capitalize("abcdef", new int[]{1, 2, 5, 100}));
        assertEquals("cOdEwArs", capitalize("codewars", new int[]{1, 3, 5, 50}));
        assertEquals("abRacaDabRA", capitalize("abracadabra", new int[]{2, 6, 9, 10}));
        assertEquals("codewArriors", capitalize("codewarriors", new int[]{5}));
    }
}

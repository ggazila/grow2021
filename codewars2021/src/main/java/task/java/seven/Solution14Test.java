package task.java.seven;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class Solution14Test {
    @Test
    public void basicTests() {
        assertEquals(true, Kata14.inviteMoreWomen(new int[] {1, -1, 1}));
        assertEquals(false, Kata14.inviteMoreWomen(new int[] {-1, -1, -1}));
        assertEquals(false, Kata14.inviteMoreWomen(new int[] {1, -1}));
        assertEquals(true, Kata14.inviteMoreWomen(new int[] {1, 1, 1}));
    }
}

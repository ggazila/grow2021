package task.java.eight;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BoolTest {
    @Test
    public void testBoolToWord() {
        assertEquals(YesOrNo.boolToWord(true),"Yes");
        assertEquals(YesOrNo.boolToWord(false),"No");
    }
}

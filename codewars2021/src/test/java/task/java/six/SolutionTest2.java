package task.java.six;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest2 {
    @Test
    public void testSomething() {
        assertEquals("70000 + 300 + 4", Kata4.expandedForm(70304));
        assertEquals("10 + 2", Kata4.expandedForm(12));
        assertEquals("40 + 2", Kata4.expandedForm(42));
     }
}

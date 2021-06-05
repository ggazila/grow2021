package task.java.seven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest6 {
    @Test
    public void testSomething() {
        doTest("ultr53o?n", "nortlu");
        doTest("krishan", "nahsirk");
        doTest("ab23c", "cba");
        doTest("krish21an", "nahsirk");
    }

    private void doTest(final String str, final String expected) {
        assertEquals(expected, Kata6.reverseLetter(str));
    }
}

package task.java.six;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest3 {
    @Test
    public void sampleTests() {
        assertEquals("one, two, three and four", Kata3.formatWords(
                new String[] { "one", "two", "three", "four" }));
        assertEquals("one", Kata3.formatWords(new String[] { "one" }));
        assertEquals("one and three",
                Kata3.formatWords(new String[] { "one", "", "three" }));
        assertEquals("three",
                Kata3.formatWords(new String[] { "", "", "three" }));
        assertEquals("one and two",
                Kata3.formatWords(new String[] { "one", "two", "" }));
        assertEquals("", Kata3.formatWords(new String[] {}));
        assertEquals("", Kata3.formatWords(null));
        assertEquals("", Kata3.formatWords(new String[] { "" }));
    }
}

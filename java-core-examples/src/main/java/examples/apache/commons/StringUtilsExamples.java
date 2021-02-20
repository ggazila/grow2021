package examples.apache.commons;

import static org.junit.Assert.*;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class StringUtilsExamples {
    public static void main(String[] args) {

    }

    @Test
    public void testChomp() {
        String test = "abc \n";
        String expected = "abc ";
        String actual = StringUtils.chomp(test);
        assertEquals(expected, actual);
    }

    @Test
    public void testChop() {
        String test = "abc";
        String expected = "ab";
        String actual = StringUtils.chop(test);
        assertEquals(expected, actual);
    }

    @Test
    public void testContains() {
        String test = "abc";
        boolean containsTrue = StringUtils.contains(test, "a");
        boolean containsFalse = StringUtils.contains(test, "k");
        assertTrue(containsTrue);
        assertFalse(containsFalse);
    }

    @Test
    public void containsAny() {
        String test = "abc";
        boolean any = StringUtils.containsAny(test, "a", "z");
        assertTrue(any);
    }

    @Test
    public void containsOnly() {
        String test = "abc";
        boolean anyF = StringUtils.containsOnly(test, "a");
        boolean any = StringUtils.containsOnly(test, "abc");
        assertTrue(any);
        assertFalse(anyF);
    }

    @Test
    public void deleteWhitespace() {
        String test = "abc";
        String expected = "abc";
        String actual = StringUtils.deleteWhitespace(test);
        assertEquals(expected, actual);
    }

    @Test
    public void difference() {
        String test1 = "abc";
        String test2 = "acqwerty";
        String actual = StringUtils.difference(test1, test2);
        String expected = "cqwerty";
        assertEquals(expected,actual);
    }
}

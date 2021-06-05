package task.java.five;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// TODO: Replace examples and use TDD by writing your own tests

public class Solution1Test {
    @Test
    public void sampleTest() {
        // assertEquals("expected", "actual");
        assertEquals(true, Solution1.validParentheses("()"));
        assertEquals(false, Solution1.validParentheses("())"));
        assertEquals(true, Solution1.validParentheses("32423(sgsdg)"));
        assertEquals(false, Solution1.validParentheses("(dsgdsg))2432"));
        assertEquals(true, Solution1.validParentheses("adasdasfa"));
        assertEquals(false,
                Solution1.validParentheses("W)mv(|])8)((V)5)l](J)()si,}"));
        assertEquals(false, Solution1.validParentheses("u)p)SH(()D(`IXe.y"));
    }
}

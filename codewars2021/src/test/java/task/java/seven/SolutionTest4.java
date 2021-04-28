package task.java.seven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest4 {
    @Test
    public void basicTests() {
        assertEquals(11, Solution4.solve("mnopqriouaeiopqrstuvwxyuaeiouaeiou"));
        assertEquals(3, Solution4.solve("suoidea"));
        assertEquals(3, Solution4.solve("ultrarevolutionariees"));
        assertEquals(2, Solution4.solve("codewarriors"));
        assertEquals(1, Solution4.solve("strengthlessnesses"));
    }
}

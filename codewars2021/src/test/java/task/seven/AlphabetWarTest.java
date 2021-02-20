package task.seven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AlphabetWarTest {
    @Test
    public void BasicTest() {
        assertEquals("Right side wins!", Kata4.alphabetWar("z"));
        assertEquals("Let's fight again!", Kata4.alphabetWar("zdqmwpbs"));
        assertEquals("Right side wins!", Kata4.alphabetWar("zzzzs"));
        assertEquals("Left side wins!", Kata4.alphabetWar("wwwwwwz"));
    }
}

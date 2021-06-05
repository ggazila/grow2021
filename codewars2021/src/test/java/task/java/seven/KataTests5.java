package task.java.seven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KataTests5 {
    @Test
    public void exampleTests() {
        Kata5 k = new Kata5();

        assertEquals(true, Kata5.isAnagram("foefet", "toffee"));
        assertEquals(true, Kata5.isAnagram("Buckethead", "DeathCubeK"));
        assertEquals(true, Kata5.isAnagram("Twoo", "Woot"));
        assertEquals(false, Kata5.isAnagram("apple", "pale"));
    }
}

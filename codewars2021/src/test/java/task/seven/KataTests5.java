package task.seven;

import static org.junit.Assert.*;
import org.junit.Test;

public class KataTests5 {
  @Test
  public void exampleTests() {
    Kata5 k = new Kata5();

    assertEquals(true, k.isAnagram("foefet", "toffee"));
    assertEquals(true, k.isAnagram("Buckethead", "DeathCubeK"));
    assertEquals(true, k.isAnagram("Twoo", "Woot"));
    assertEquals(false, k.isAnagram("apple", "pale"));
  }
}

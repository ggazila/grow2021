package task.seven;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class KataTests2 {
    @Test
    public void exampleTests() {
      assertEquals(8, Kata2.dontGiveMeFive(1,9));
      assertEquals(12, Kata2.dontGiveMeFive(4,17));
    }
}

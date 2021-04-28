package task.java.seven;

import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.*;

public class KataTest1 {
  @Test
  public void test1() {
    assertEquals("42 -9", Kata1.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
  }
}

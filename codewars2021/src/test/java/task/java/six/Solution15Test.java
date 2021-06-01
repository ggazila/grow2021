package task.java.six;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Solution15Test {
    @Test
    public void tests() {
        assertEquals("Incorrect", "camel Casing",
                Solution3.camelCase("camelCasing"));
        assertEquals("Incorrect", "camel Casing Test",
                Solution3.camelCase("camelCasingTest"));
        assertEquals("Incorrect", "camelcasingtest",
                Solution3.camelCase("camelcasingtest"));
    }

}

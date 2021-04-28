package examples.ocp.chapter3;

import java.util.Random;

public class Secret {
    private int number = new Random().nextInt(10);

    public boolean guess(int candidate) {
        return number == candidate;
    }
}

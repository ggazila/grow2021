package task.eight;

import java.util.Arrays;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {

        return (int) Arrays.stream(arrayOfSheeps)
                .filter(arrayOfSheep -> arrayOfSheep != null && arrayOfSheep)
                .count();
    }
}

package task.java.seven;

import java.util.stream.IntStream;

public class Kata9 {
    public static boolean smallEnough(int[] a, int limit) {
        return IntStream.of(a).allMatch(value -> value <= limit);
    }

}

/*
You will be given an array and a limit value. You must check that all values in the array are
below or equal to the limit value. If they are, return true. Else, return false.

You can assume all values in the array are numbers.
 */

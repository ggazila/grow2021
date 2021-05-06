package task.java.six;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Kata1 {

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> aList = Arrays.stream(b).boxed()
                .collect(Collectors.toList());
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : a) {
            if (!aList.contains(i)) {
                result.add(i);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    public static int[] arrayDiff2(int[] a, int[] b) {
        return IntStream.of(a)
                .filter(i -> IntStream.of(b).noneMatch(y -> i == y)).toArray();
    }

}

//    Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
//
//        It should remove all values from list a, which are present in list b keeping their order.
//
//        array_diff({1, 2}, 2, {1}, 1, *z) == {2} (z == 1)
//        If a value is present in b, all of its occurrences must be removed from the other:
//
//        array_diff({1, 2, 2, 2, 3}, 5, {2}, 1, *z) == {1, 3} (z == 2)

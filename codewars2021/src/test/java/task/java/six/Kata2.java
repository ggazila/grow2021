package task.java.six;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Kata2 {
    public static int[] sortArray(int[] array) {
        List<Integer> collect = IntStream.of(array).boxed()
                .filter(integer -> integer % 2 != 0).sorted()
                .collect(Collectors.toList());

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                collect.add(i, array[i]);
            }
        }

        return collect.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] sortArray2(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j] && array[i] % 2 == 1
                        && array[j] % 2 == 1) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}

/*
You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.

Examples
[7, 1]  =>  [1, 7]
[5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]

 */

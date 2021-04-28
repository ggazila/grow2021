package task.java.seven;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution6 {
    static int stray(int[] numbers) {
        List<Integer> collect = Arrays.stream(numbers).boxed().sorted()
                .collect(Collectors.toList());
        for (int i = 0; i < collect.size() - 1; i++) {
            if (!collect.get(i).equals(collect.get(i + 1))) {
                return collect.get(i);
            } else {
                i++;
            }
        }
        return collect.get(collect.size() - 1);
    }

  static int betterStray(int[] numbers) {
    return Arrays.stream(numbers).reduce(0, (a, b) -> a ^ b);
  }

}



/*
You are given an odd-length array of integers, in which all of them are the same, except for one single number.

Complete the method which accepts such an array, and returns that single different number.

The input array will always be valid! (odd-length >= 3)

Examples
[1, 1, 2] ==> 2
[17, 17, 3, 17, 17, 17, 17] ==> 3

 */

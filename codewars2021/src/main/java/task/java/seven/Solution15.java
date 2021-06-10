package task.java.seven;

import java.util.HashMap;

class Solution15 {

  public static String isSortedAndHow(int[] array) {
      String sortType = array[0] < array[array.length - 1] ? "ascending" : "descending";

      if (sortType.equals("ascending")) {
        for (int i = 0; i < array.length - 1; i++) {
          if (array[i] > array[i + 1]) {
            return "no";
          }
        }
      }

      return "yes, " + sortType;
  }

}

//    Complete the method which accepts an array of integers, and returns one of the following:
//
//        "yes, ascending" - if the numbers in the array are sorted in an ascending order
//        "yes, descending" - if the numbers in the array are sorted in a descending order
//        "no" - otherwise
//        You can assume the array will always be valid, and there will always be one correct
//        answer.


package task.java.seven;

public class RoundToTheNextMultipleOf5 {

  public static int roundToNext5(int number) {
    while (number % 5 != 0) {
      number++;
    }
    return number;
  }
}

/*
Given an integer as input, can you round it to the next (meaning, "higher") multiple of 5?

Examples:

input:    output:
0    ->   0
2    ->   5
3    ->   5
12   ->   15
21   ->   25
30   ->   30
-2   ->   0
-5   ->   -5
etc.
Input may be any positive or negative integer (including 0).

You can assume that all inputs are valid integers.


 */

package task.java.seven;

public class Kata3 {

    public static boolean abundantNumber(int num) {
      int sum = 0;

      for (int i = 2; i <= num / 2; i++) {
        if (num % i == 0) {
          sum += i;
        }
      }

      return sum + 1 > num;
    }

}

/*
An abundant number or excessive number is a number for which the sum of its proper divisors is greater than the number itself.

The integer 12 is the first abundant number. Its proper divisors are 1, 2, 3, 4 and 6 for a total of 16 (> 12).

Derive function abundantNumber(num)/abundant_number(num) which returns true/True/.true. if num is abundant, false/False/.false. if not.
 */

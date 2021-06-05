package task.java.seven;

public class ReverseNumber {

    public static int reverse(int number) {
        StringBuilder s = new StringBuilder(String.valueOf(number));
        if (s.charAt(0) == '-') {
            s.delete(0, 1);
            s.reverse();
            s.insert(0, "-");
        } else {
            s.reverse();
        }

        return Integer.parseInt(s.toString());
    }

}

/*
Given a number, write a function to output its reverse digits. (e.g. given 123 the answer is 321)

Numbers should preserve their sign; i.e. a negative number should still be negative when reversed.

Examples
 123 ->  321
-456 -> -654
1000 ->    1

 */

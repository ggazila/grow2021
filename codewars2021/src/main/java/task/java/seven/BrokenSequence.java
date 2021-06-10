package task.java.seven;

public class BrokenSequence {
    public static void main(String[] args) {
        char c = '5';
    }

    public int findMissingNumber(String sequence) {
        if (sequence.length() == 0) {
            return 0;
        }

        String[] numbers = sequence.split(" ");

        for (int i = 0; i < numbers.length; i += 2) {
            char[] aChar = numbers[i].toCharArray();
            for (char c : aChar) {
                if (!Character.isDigit(c)) {
                    return 1;
                }
            }
        }

        if (Integer.parseInt(numbers[0]) != 1) {
            return 1;
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            String left = numbers[i];
            String right = numbers[i + 1];
            int i1 = Integer.parseInt(left);
            int i2 = Integer.parseInt(right);
            if (i1 + 1 != i2) {
                return i1 + 1;
            }
        }

        return 0;
    }
}

/*
You receive some random elements as a space-delimited string. Check if the elements are part of
an ascending sequence of integers starting with 1, with an increment of 1 (e.g. 1, 2, 3, 4).

Return:

0 if the elements can form such a sequence, and no number is missing ("not broken", e.g. "1 2 4 3")
1 if there are any non-numeric elements in the input ("invalid", e.g. "1 2 a")
n if the elements are part of such a sequence, but some numbers are missing, and n is the lowest
 of them ("broken", e.g. "1 2 4" or "1 5")
Examples
"1 2 3 4"  ==>  return 0, because the sequence is complete

"1 2 4 3"  ==>  return 0, because the sequence is complete (order doesn't matter)

"2 1 3 a"  ==>  return 1, because it contains a non numerical character

"1 3 2 5"  ==>  return 4, because 4 is missing from the sequence

"1 5"      ==>  return 2, because the sequence is missing 2, 3, 4 and 2 is the lowest

 */

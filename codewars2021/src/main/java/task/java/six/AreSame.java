package task.java.six;

import java.util.Arrays;

public class AreSame {

    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = Math.abs(a[i]);
            b[i] = Math.abs(b[i]);
        }

        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            if (a[i] * a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}

/*
Invalid arrays
If, for example, we change the first number to something else, comp may not return true anymore:

a = [121, 144, 19, 161, 19, 144, 19, 11]
b = [132, 14641, 20736, 361, 25921, 361, 20736, 361]
comp(a,b) returns false because in b 132 is not the square of any number of a.

a = [121, 144, 19, 161, 19, 144, 19, 11]
b = [121, 14641, 20736, 36100, 25921, 361, 20736, 361]
comp(a,b) returns false because in b 36100 is not the square of any number of a.

Remarks
a or b might be [] or {} (all languages except R, Shell).
a or b might be nil or null or None or nothing (except in C++, Elixir, Haskell, PureScript,
Pascal, R, Rust, Shell).
If a or b are nil (or null or None, depending on the language), the problem doesn't make sense
so return false.

Note for C
The two arrays have the same size (> 0) given as parameter in function comp.


 */

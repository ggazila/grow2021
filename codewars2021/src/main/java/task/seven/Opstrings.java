package task.seven;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.function.Function;

class Opstrings {

    public static void main(String[] args) {
        Date date = new Date(2017, Calendar.JANUARY, 13);
        Date date2 = new GregorianCalendar(2017, Calendar.JANUARY, 13).getTime();
        System.out.println("Date " + date + " is friday 13 => " + isFriday13(date));
        System.out.println("GregorianCalendar " + date2 + " is friday 13 => " + isFriday13(date2));
    }

   static boolean isFriday13(Date date) {
        return date.getDay() + 1 == Calendar.FRIDAY && date.getDate() == 13;
    }















    public static String vertMirror(String strng) {
        String[] split = strng.split("\n");
        for (int i = 0, splitLength = split.length; i < splitLength; i++) {
            String s = split[i];
            split[i] = new StringBuilder(s).reverse().toString();
        }
        return String.join("\n", split);
    }

    public static String horMirror(String strng) {
        String[] split = strng.split("\n");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            String s = split[i];
            stringBuilder.append(s).append("\n");
        }
        return stringBuilder.toString().trim();
    }

    public static String oper(Function<String, String> func, String s) {
        return func.apply(s);
    }
}

/*
This kata is the first of a sequence of four about "Squared Strings".

You are given a string of n lines, each substring being n characters long: For example:

s = "abcd\nefgh\nijkl\nmnop"

We will study some transformations of this square of strings.

Vertical mirror: vert_mirror (or vertMirror or vert-mirror)
vert_mirror(s) => "dcba\nhgfe\nlkji\nponm"
Horizontal mirror: hor_mirror (or horMirror or hor-mirror)
hor_mirror(s) => "mnop\nijkl\nefgh\nabcd"
or printed:

vertical mirror   |horizontal mirror
abcd --> dcba     |abcd --> mnop
efgh     hgfe     |efgh     ijkl
ijkl     lkji     |ijkl     efgh
mnop     ponm     |mnop     abcd
Task:
Write these two functions
and

high-order function oper(fct, s) where

fct is the function of one variable f to apply to the string s (fct will be one of vertMirror, horMirror)

Examples:
s = "abcd\nefgh\nijkl\nmnop"
oper(vert_mirror, s) => "dcba\nhgfe\nlkji\nponm"
oper(hor_mirror, s) => "mnop\nijkl\nefgh\nabcd"
Note:
The form of the parameter fct in oper changes according to the language. You can see each form according to the language in "Sample Tests".

Bash Note:
The input strings are separated by , instead of \n. The output strings should be separated by \r instead of \n. See "Sample Tests".

Forthcoming katas will study other transformations.


 */

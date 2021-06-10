package task.java.seven;

public class Solution16 {
    public static String capitalize(String s, int[] ind) {
        char[] chars = s.toCharArray();

        for (int i : ind) {
            if (i < s.length()) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        return String.valueOf(chars);
    }
}

/*
Given a string and an array of integers representing indices, capitalize all letters at the
given indices.

For example:

capitalize("abcdef",[1,2,5]) = "aBCdeF"
capitalize("abcdef",[1,2,5,100]) = "aBCdeF". There is no index 100.
The input will be a lowercase string with no spaces and an array of digits.

Good luck!

Be sure to also try:

Alternate capitalization

String array revisal


 */

package task.java.seven;

import java.util.Arrays;

class MaxDiffLength {

    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        }
        Integer a1Max = Arrays.stream(a1).map(String::length)
                .max(Integer::compareTo).get();
        Integer a1min = Arrays.stream(a1).map(String::length)
                .min(Integer::compareTo).get();

        Integer a2Max = Arrays.stream(a2).map(String::length)
                .max(Integer::compareTo).get();
        Integer a2min = Arrays.stream(a2).map(String::length)
                .min(Integer::compareTo).get();

        int abs1 = Math.abs(a1Max - a2min);
        int abs2 = Math.abs(a2Max - a1min);
        return Math.max(abs1, abs2);
    }
}

/*
You are given two arrays a1 and a2 of strings. Each string is composed with letters from a to z. Let x be any string in the first array and y be any string in the second array.

Find max(abs(length(x) − length(y)))

If a1 and/or a2 are empty return -1 in each language except in Haskell (F#) where you will return Nothing (None).

Example:
a1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"]
a2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]
mxdiflg(a1, a2) --> 13
Bash note:
input : 2 strings with substrings separated by ,
output: number as a string

 */

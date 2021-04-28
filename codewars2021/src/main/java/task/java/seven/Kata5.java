package task.java.seven;

import java.util.Arrays;

public class Kata5 {
    public static boolean isAnagram(String test, String original) {
        String[] left = test.toLowerCase().split("");
        String[] right = original.toLowerCase().split("");

        Arrays.sort(left);
        Arrays.sort(right);
        return Arrays.equals(left, right);
    }
}

/*
An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).

Note: anagrams are case insensitive

Complete the function to return true if the two arguments given are anagrams of each other; return false otherwise.

Examples
"foefet" is an anagram of "toffee"

"Buckethead" is an anagram of "DeathCubeK"


 */

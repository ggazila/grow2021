package task.leetcode.june13.easy;

import java.util.HashMap;
import java.util.Map;

public class Solution6 {
    public static void main(String[] args) {
        System.out.println(new Solution6().checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(new Solution6().checkIfPangram("leetcode"));
    }

    public boolean checkIfPangram(String sentence) {
        Map<Character, Boolean> characters = new HashMap<>();
        for (char i = 'a'; i <= 'z'; i++) {
            characters.put(i, false);
        }

        char[] chars = sentence.toCharArray();
        for (char aChar : chars) {
            characters.compute(aChar, (character, aBoolean) -> aBoolean = true);
        }

        return characters.values().stream().allMatch(aBoolean -> aBoolean);
    }

    public boolean checkIfPangramBetter(String sentence) {
        for (char c = 'a'; c <= 'z'; c++) {
            if (!sentence.contains(Character.toString(c))) {
                return false;
            }
        }
        return true;
    }
}

/*
1832. Check if the Sentence Is Pangram
Easy

234

7

Add to List

Share
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a
pangram, or false otherwise.



Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false
 */

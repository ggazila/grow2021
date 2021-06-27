package task.leetcode.june13.easy;

public class Solution7 {
    public static void main(String[] args) {
        System.out.println(new Solution7().arrayStringsAreEqual(new String[]{"ab", "c"},
                new String[]{"ab", "c"}));
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }

    public boolean arrayStringsAreEqualFaster(String[] word1, String[] word2) {
        StringBuilder string1 = new StringBuilder();
        StringBuilder string2 = new StringBuilder();

        for (String st : word1) {
            string1.append(st);
        }

        for (String st1 : word2) {
            string2.append(st1);
        }

        return string1.toString().equals(string2.toString());

    }

}

/*
1662. Check If Two String Arrays are Equivalent
Easy

421

91

Add to List

Share
Given two string arrays word1 and word2, return true if the two arrays represent the same
string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.



Example 1:

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
Example 2:

Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false
Example 3:

Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true


Constraints:

1 <= word1.length, word2.length <= 103
1 <= word1[i].length, word2[i].length <= 103
1 <= sum(word1[i].length), sum(word2[i].length) <= 103
word1[i] and word2[i] consist of lowercase letters.

 */

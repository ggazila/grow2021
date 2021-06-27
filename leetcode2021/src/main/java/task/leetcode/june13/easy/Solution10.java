package task.leetcode.june13.easy;

public class Solution10 {
    public static void main(String[] args) {
        System.out.println(new Solution10().lengthOfLastWord("a"));
        System.out.println(new Solution10().lengthOfLastWord(" "));
    }

    public int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        if (s1.length == 0) {
            return 0;
        }
        return s1[s1.length - 1].length();
    }
}

/*
58. Length of Last Word
Easy

1188

3291

Add to List

Share
Given a string s consists of some words separated by spaces, return the length of the last word in the string. If the last word does not exist, return 0.

A word is a maximal substring consisting of non-space characters only.



Example 1:

Input: s = "Hello World"
Output: 5
Example 2:

Input: s = " "
Output: 0


Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
Accepted
522.9K
Submissions
1.6M

 */

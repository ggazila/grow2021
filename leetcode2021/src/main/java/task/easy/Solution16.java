package task.easy;

import java.util.Arrays;
import java.util.Comparator;

public class Solution16 {
    public static void main(String[] args) {
        System.out.println(new Solution16().longestCommonPrefix(new String[]{"a"}));
        System.out.println(new Solution16().longestCommonPrefix(new String[]{"ab", "a"}));
        System.out.println(new Solution16().longestCommonPrefix(new String[]{"dog", "racecar",
                "car"}));
        System.out.println(new Solution16().longestCommonPrefix(new String[]{"flower", "flow",
                "flight"}));
        System.out.println(new Solution16().fasterSolution(new String[]{"flower", "flow",
                "flight"}));
    }

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, Comparator.comparingInt(String::length));

        int maxIndex = 0;

        tt:
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (!strs[j].startsWith(strs[0].substring(0, i + 1))) {
                    break tt;
                }
            }
            maxIndex++;
        }

        return strs[0].substring(0, maxIndex);
    }

    public String fasterSolution(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
}

/*
14. Longest Common Prefix
Easy

4248

2258

Add to List

Share
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lower-case English letters.
 */

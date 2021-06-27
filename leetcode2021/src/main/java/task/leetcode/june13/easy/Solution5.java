package task.leetcode.june13.easy;

import java.util.ArrayList;
import java.util.List;

public class Solution5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("phone");
        list.add("blue");
        list.add("pixel");
        List<List<String>> lists = new ArrayList<>();
        lists.add(list);
        System.out.println(new Solution5().countMatches(lists, "color", "blue"));
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> item : items) {
            switch (ruleKey) {
                case "type":
                    count = getCount(ruleValue, count, item, 0);
                    break;
                case "color":
                    count = getCount(ruleValue, count, item, 1);
                    break;
                case "name":
                    count = getCount(ruleValue, count, item, 2);
                    break;
            }
        }
        return count;
    }

    public int countMatchesBetter(List<List<String>> items, String ruleKey, String ruleValue) {
        int rule = 0;
        if (ruleKey.equals("type"))
            rule = 0;
        else if (ruleKey.equals("color"))
            rule = 1;
        else
            rule = 2;

        int count = 0;

        for (List<String> item : items) {
            if (item.get(rule).equals(ruleValue))
                count++;
        }

        return count;
    }

    private int getCount(String ruleValue, int count, List<String> item, int i) {
        if (item.get(i).equals(ruleValue)) {
            count++;
        }
        return count;
    }

}

/*
1773. Count Items Matching a Rule
Easy

336

56

Add to List

Share
You are given an array items, where each items[i] = [typei, colori, namei] describes the type,
color, and name of the ith item. You are also given a rule represented by two strings, ruleKey
and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.



Example 1:

Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold",
"iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver",
"lenovo"].
Example 2:

Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold",
"iphone"]], ruleKey = "type", ruleValue = "phone"
Output: 2
Explanation: There are only two items matching the given rule, which are ["phone","blue",
"pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does
not match.


Constraints:

1 <= items.length <= 104
1 <= typei.length, colori.length, namei.length, ruleValue.length <= 10
ruleKey is equal to either "type", "color", or "name".
All strings consist only of lowercase letters.
Accepted
52,444
Submissions
61,976

 */

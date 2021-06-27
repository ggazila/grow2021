package task.leetcode.june13.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution8 {
    public static void main(String[] args) {
        System.out.println(new Solution8().uniqueMorseRepresentations(new String[]{"gin", "zen",
                "gig", "msg"}));
    }

    public int uniqueMorseRepresentations(String[] words) {
        List<String> list = Arrays.asList(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..");
        Set<String> set = new HashSet<>();

        StringBuilder builder = new StringBuilder();

        for (String s : words) {
            char[] chars = s.toCharArray();
            for (char aChar : chars) {
                builder.append(list.get(aChar - 97));
            }
            set.add(builder.toString());
            builder.delete(0, builder.length());
        }

        return set.size();
    }

    public int uniqueMorseRepresentationsBetter(String[] words) {
        String[] morseCodeMap = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder sbr = new StringBuilder();
        Set<String> result = new HashSet<>();
        for (String s : words) {
            for (char c : s.toCharArray()) {
                sbr.append(morseCodeMap[c - 'a']);
            }
            result.add(sbr.toString());
            sbr.setLength(0);
        }
        return result.size();
    }

}

/*
804. Unique Morse Code Words
Easy

957

871

Add to List

Share
International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.

For convenience, the full table for the 26 letters of the English alphabet is given below:

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cab" can be written as "-.-..--...", (which is the concatenation "-.-." + ".-" + "-..."). We'll call such a concatenation, the transformation of a word.

Return the number of different transformations among all words we have.

Example:
Input: words = ["gin", "zen", "gig", "msg"]
Output: 2
Explanation:
The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."

There are 2 different transformations, "--...-." and "--...--.".
Note:

The length of words will be at most 100.
Each words[i] will have length in range [1, 12].
words[i] will only consist of lowercase letters.

 */

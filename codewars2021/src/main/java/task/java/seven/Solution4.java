package task.java.seven;

;

class Solution4 {
    public static int solve(String s) {
        String[] split = s.split("");
        int count = 0;
        int max = 0;

        for (String letter : split) {
            if (letter.matches("[oeaiu]")) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }

        return Math.max(max, count);
    }
}

/*
The vowel substrings in the word codewarriors are o,e,a,io. The longest of these has a length of 2. Given a lowercase string that has alphabetic characters only (both vowels and consonants) and no spaces, return the length of the longest vowel substring. Vowels are any of aeiou.

Good luck!
 */

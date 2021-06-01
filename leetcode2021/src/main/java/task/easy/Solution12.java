package task.easy;

import java.util.Map;
import java.util.TreeMap;

public class Solution12 {
    public static void main(String[] args) {
        System.out.println(new Solution12().sortSentence("is2 sentence4 This1 a3"));
        System.out.println(new Solution12().sortSentence("Myself2 Me1 I4 and3"));
    }

    public String sortSentence(String s) {
        Map<Integer, String> map = new TreeMap<>();
        String[] split = s.split(" ");
        for (String s1 : split) {
            map.put(Integer.parseInt(s1.substring(s1.length() - 1)),
                    s1.substring(0, s1.length() - 1));
        }

        return String.join(" ", map.values());
    }

}

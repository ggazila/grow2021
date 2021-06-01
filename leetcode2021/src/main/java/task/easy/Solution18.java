package task.easy;

import java.util.ArrayList;
import java.util.List;

public class Solution18 {
    public static void main(String[] args) {
        System.out.println(new Solution18().removeDuplicates("abbaca"));
        System.out.println(new Solution18().fasterSolution("abbaca"));
    }

    public String removeDuplicates(String s) {
        List<String> split = new ArrayList<>(List.of(s.split("")));
        for (int i = 0; i < split.size() - 1; i++) {
            if (split.get(i).equals(split.get(i + 1))) {
                split.remove(i);
                split.remove(i);
                i = -1;
            }
        }

        return String.join("", split);
    }

    public String fasterSolution(String s) {
        char[] chars = s.toCharArray();

        int length = 0;

        for (char ch : chars) {
            chars[length] = ch;
            if (length > 0 && ch == chars[length - 1]) {
                length--;
            } else {
                length++;
            }
        }

        return new String(chars, 0, length);
    }
}

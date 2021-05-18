package task.java.six;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Kata3 {

    public static String formatWords(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }

        StringBuilder builder = new StringBuilder();
        List<String> collect = Arrays.stream(words).filter(s -> s.length() > 0)
                .collect(Collectors.toList());

        for (int i = 0; i < collect.size(); i++) {
            builder.append(collect.get(i));
            if (i == collect.size() - 2) {
                builder.append(" and ");
            } else if (i < collect.size() - 1) {
                builder.append(", ");
            }

        }
        return builder.toString();
    }

}

/*
Complete the method so that it formats the words into a single comma separated value. The last word should be separated by the word 'and' instead of a comma. The method takes in an array of strings and returns a single formatted string. Empty string values should be ignored. Empty arrays or null/nil values being passed into the method should result in an empty string being returned.

Kata.formatWords(new String[] {"ninja", "samurai", "ronin"}) => "ninja, samurai and ronin"
Kata.formatWords(new String[] {"ninja", "", "ronin"}) => "ninja and ronin"
Kata.formatWords(new String[] {}) => ""

 */

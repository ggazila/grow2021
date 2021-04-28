package task.java.six;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateEncoder {
    static String encode(String word) {
        String[] strings = word.toLowerCase().split("");
        Map<String, Long> map = Stream.of(strings).collect(Collectors
                .groupingBy(Function.identity(), Collectors.counting()));
        StringBuilder builder = new StringBuilder();
        for (String s : strings) {
            if (map.get(s) > 1) {
                builder.append(")");
            } else
                builder.append("(");
        }
        return builder.toString();
    }
}

/*
The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string, or ")" if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.

Examples
"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))(("
Notes

Assertion messages may be unclear about what they display in some languages. If you read "...It Should encode XXX", the "XXX" is the expected result, not the input!

 */

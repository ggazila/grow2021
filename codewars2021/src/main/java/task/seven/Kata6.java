package task.seven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kata6 {
    public static String reverseLetter(final String str) {
        String replace = str.replaceAll("[^A-Za-z]", "");
        List<String> strings = new ArrayList<>(Arrays.asList(replace.split("")));
        Collections.reverse(strings);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetter(ch)) {
                strings.add(i, String.valueOf(str.charAt(i)));
            }
        }

        return String.join("", strings); //coding and coding..
    }
}

/*
Task
Given a string str, reverse it omitting all non-alphabetic characters.

Example
For str = "krishan", the output should be "nahsirk".

For str = "ultr53o?n", the output should be "nortlu".

Input/Output
[input] string str

A string consists of lowercase latin letters, digits and symbols.

[output] a string

 */
package task.java.six;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        List<String> collect = Stream
                .of(":) ;) :-) ;-) ;~) :~) ;D ;~D :D :-D ;-D :~D".split(" "))
                .collect(Collectors.toList());
        int count = 0;
        for (String s : arr) {
            if (collect.contains(s)) {
                count++;
            }
        }
        return count;
    }

    public static int countSmileys2(List<String> arr) {
        return (int) arr.stream().filter(x -> x.matches("[:;][-~]?[)D]"))
                .count();
    }
}
/*
Given an array (arr) as an argument complete the function countSmileys that should return the total number of smiling faces.

Rules for a smiling face:

Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
Every smiling face must have a smiling mouth that should be marked with either ) or D
No additional characters are allowed except for those mentioned.

Valid smiley face examples: :) :D ;-D :~)
Invalid smiley faces: ;( :> :} :]

Example
countSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;

 */

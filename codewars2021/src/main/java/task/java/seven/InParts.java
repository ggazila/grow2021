package task.java.seven;

public class InParts {
    public static String splitInParts(String s, int partLength) {
        int length = s.length() / partLength;
        length = s.length() % partLength == 0 ? length : length + 1;
        String[] split = new String[length];

        int count = 0;
        int index = 0;
        while (count < s.length()) {
            int endIndex = count + partLength;
            if (endIndex >= s.length()) {
                endIndex = s.length();
            }
            split[index++] = s.substring(count, endIndex);
            count += partLength;
        }

        return String.join(" ", split);
    }
}

/*
The aim of this kata is to split a given string into different strings of equal size (note size of strings is passed to the method)

Example:

Split the below string into other strings of size #3

'supercalifragilisticexpialidocious'

Will return a new string
'sup erc ali fra gil ist ice xpi ali doc iou s'
Assumptions:

String length is always greater than 0
String has no spaces
Size is always positive
 */

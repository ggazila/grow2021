package task.eight;

public class Kata1 {

    public static String solution(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
        }
        return String.valueOf(chars);
    }

}

/*
Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'

 */

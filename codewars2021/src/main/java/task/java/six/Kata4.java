package task.java.six;

public class Kata4 {
    public static String expandedForm(int num) {
        String[] str = Integer.toString(num).split("");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length - 1; i++) {
            if (Integer.parseInt(str[i]) > 0) {
                for (int j = i; j < str.length - 1; j++) {
                    str[i] += '0';
                }
            }
        }

        for (String s : str) {
            if (!s.equals("0")) {
                result.append(s).append(" ");
            }
        }

        return result.toString().trim().replace(" ", " + ");
    }
}

/*
Write Number in Expanded Form
You will be given a number and you will need to return it as a string in Expanded Form. For example:

Kata.expandedForm(12); # Should return "10 + 2"
Kata.expandedForm(42); # Should return "40 + 2"
Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
NOTE: All numbers will be whole numbers greater than 0.

If you liked this kata, check out part 2!!


 */

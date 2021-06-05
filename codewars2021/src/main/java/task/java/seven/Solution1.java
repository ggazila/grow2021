package task.java.seven;

class Solution1 {
    public static String solve(String a, String b) {
        StringBuilder result = new StringBuilder();

        String[] left = a.split("");
        String[] right = b.split("");

        for (String s : left) {
            if (!b.contains(s)) {
                result.append(s);
            }
        }

        for (String s : right) {
            if (!a.contains(s)) {
                result.append(s);
            }
        }

        return result.toString();
    }
}

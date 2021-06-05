package task.java.eight;

import java.util.ArrayList;

class YesOrNo {
    public static String boolToWord(boolean b) {
        return b ? "Yes" : "No";
    }

    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        System.out.println(objects.contains(null));
    }
}

/*
Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.
 */

package examples;

import java.util.Arrays;

public class DefaultValues {
    static boolean b1;
    static Boolean b2;
    static int i1;
    static Integer i2;
    static String s1;

    public static void main(String[] args) {
        String s2;
        int i3;
        Integer i4;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(s1);
        //        System.out.println(s2);
        //        System.out.println(i3);
        //        System.out.println(i4);

        Integer[] ar = new Integer[5];
        System.out.println(Arrays.toString(ar));
    }
}

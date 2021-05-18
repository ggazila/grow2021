package examples.spravochnik.chapter1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int i = 5;
        System.out.println(i);
        System.out.println(~i);
        System.out.println(5 & 51);
        System.out.println(5 | 51);
        System.out.println(5 ^ 10);
        System.out.println(5 >> 2);
        System.out.println(5 >>> 2);
        System.out.println(5 << 4);
        manyParams("Sergey", 25);
    }

    private static void manyParams(String name, int... years) {
        int[] years1 = years;
        for (int year : years1) {
            System.out.println(Arrays.toString(years1));
        }
    }
}

package examples.ocp.chapter3;

import java.util.function.Function;

public class Main {
    static int one = 1;

    public static void main(String[] args) {
        seventeenth();
    }

    private static void seventeenth() {
        int a = 4;
//        a = 5;
        Function<Integer, String> function = integer -> String
                .valueOf(integer + a);
//        a = 5;

        function.apply(a);
//        a = 5;

    }

    void seven() {
        System.out.println(one);
    }
}

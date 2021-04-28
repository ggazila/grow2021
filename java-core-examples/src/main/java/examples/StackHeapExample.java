package examples;

import java.util.ArrayList;
import java.util.List;

public class StackHeapExample {
    public static void main(String[] args) {
        one();
        two();
    }

    private static void one() {
        System.out.println("Recursion");
        one();
    }

    private static void two() {
        List<Integer> integers = new ArrayList<>();
        while (true) {
            integers.add(1);
        }
    }
}

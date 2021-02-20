package examples.collections;

import java.util.ArrayList;
import java.util.List;

public class LargeArrayExample {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        int count = 0;
        while (true) {
            integers.add(count++);
        }
    }
}

package examples.ocp.chapter6;

import java.util.List;

public class Bounce {
    public static void main(String[] args) {
        List.of(1, 2, 3, 4).stream().forEach(System.out::println);
//        List.of(1, 2, 3, 4).parallel().forEach(System.out::println);
    }
}

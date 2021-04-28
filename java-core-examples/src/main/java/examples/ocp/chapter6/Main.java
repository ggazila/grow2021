package examples.ocp.chapter6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToIntFunction;

public class Main {
    public static void main(String[] args) {
        six();
        twelve();
        fifteen();
        twentyTwo();
    }

    private static void twentyTwo() {
        ToDoubleBiFunction<Integer, Double> function = (Integer a, Double b) -> {
            int c;
            return b;
        };
    }

    private static void fifteen() {
        //        Function<Integer, Integer> transformer = x -> x;
        //        UnaryOperator<Integer> transformer = x -> x;
        ToIntFunction<Integer> transformer = x -> x;

        var prime = List.of(3, 1, 4, 1, 5, 9).stream().limit(1).peek(s -> {
        }).mapToInt(transformer).peek(s -> {
        }).sum();
    }

    private static void twelve() {
        var empty = Optional.empty();
        var param = Optional.of(null);
        var method = Optional.ofNullable(null);
    }

    private static void six() {
        var list = new ArrayList<String>();
        list.add("Austin");
        list.add("Boston");
        list.add("San Francisco");

        var c = list.stream().filter(a -> a.length() > 10).count();
        System.out.println(c + " " + list.size());
    }
}

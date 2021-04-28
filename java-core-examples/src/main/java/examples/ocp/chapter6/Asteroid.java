package examples.ocp.chapter6;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Asteroid {
    public static void main(String[] debris) {
        new Asteroid().mine((s, p) -> s + p);
    }

    public void mine(BiFunction<Integer, Double, Double> lambda) {
//    public void mine(BiConsumer<Integer, Double> lambda) {
        // IMPLEMENTATION OMITTED
    }
}

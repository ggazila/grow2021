package examples.ocp.chapter8;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        one();
        six();
    }

    private static void six() {
        var original = List.of(1, 2, 3, 4, 5);

        var copy1 = new CopyOnWriteArrayList<Integer>(original);
        for (Integer integer : copy1) {
            copy1.remove(integer);
        }

        //        var copy2 = Collections.synchronizedList(original);
        //        for (Integer integer : copy2) {
        //            copy2.remove(integer);
        //        }

        //        var copy3 = new ArrayList<Integer>(original);
        //        for (Integer integer : copy3) {
        //            copy3.remove(integer);
        //        }

        var copy4 = new ConcurrentLinkedQueue<Integer>(original);
        for (Integer integer : copy4) {
            copy4.remove(integer);
        }
    }

    private static void one() {
        Callable c = new Callable() {
            @Override
            public Object call() throws Exception {
                return null;
            }
        };
    }
}

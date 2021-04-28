package examples.ocp.chapter8;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TpsReport {
    public static void main(String[] args)
            throws ExecutionException, InterruptedException {
        new TpsReport().submitReports();
    }

    public void submitReports()
            throws ExecutionException, InterruptedException {
        var s = Executors.newCachedThreadPool();
        Future bosses = s.submit(() -> System.out.println("1"));

        s.shutdown();
        System.out.println("aaaaa");
        System.out.println(bosses.get());
    }
}

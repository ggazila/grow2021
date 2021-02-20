package examples.concurrency;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExample {
    public static void main(String[] args)
            throws ExecutionException, InterruptedException {
        //        ExecutorService executorService = Executors.newSingleThreadExecutor();
        //
        //        executorService.execute(new Runnable() {
        //            public void run() {
        //                System.out.println("Asynchronous task");
        //            }
        //        });
        //
        //        executorService.shutdown();
        //
        //        Future<?> future = executorService.submit(new Runnable() {
        //            public void run() {
        //                System.out.println("Asynchronous task");
        //            }
        //        });
        //
        //        future.get();  //returns null if the task has finished correctly.

        //        ExecutorService executorService = Executors.newSingleThreadExecutor();
        //
        //        Set<Callable<String>> callables = new HashSet<Callable<String>>();
        //
        //        callables.add(new Callable<String>() {
        //            public String call() throws Exception {
        //                return "Task 1";
        //            }
        //        });
        //        callables.add(new Callable<String>() {
        //            public String call() throws Exception {
        //                return "Task 2";
        //            }
        //        });
        //        callables.add(new Callable<String>() {
        //            public String call() throws Exception {
        //                return "Task 3";
        //            }
        //        });
        //
        //        String result = executorService.invokeAny(callables);
        //
        //        System.out.println("result = " + result);
        //
        //        executorService.shutdown();

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Set<Callable<String>> callables = new HashSet<Callable<String>>();

        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 1";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 2";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 3";
            }
        });

        List<Future<String>> futures = executorService.invokeAll(callables);

        for (Future<String> future : futures) {
            System.out.println("future.get = " + future.get());
        }

        executorService.shutdown();

    }
}

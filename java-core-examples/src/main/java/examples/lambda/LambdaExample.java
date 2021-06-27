package examples.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample {



    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("ffff");
            }
        };

        Runnable runnable2 = () -> System.out.println("dd");

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        List<Integer> collect = list.stream()
                .filter(oneNumber -> oneNumber % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}

package examples.solid;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        two();
    }

    private static void two() {
        List<Integer> integers = new ArrayList<>();
        while (true) {
            integers.add(1);
        }
    }
}

/*
OutOfMemoryError
Результат работы программы:

- Вылетит StackOverflowError
- Вылетит OutOfMemoryError
- Код не скомпилируется
- Цикл будет вечно добавлять данные
 */

package examples;

public class Example {
    public static void main(String[] args) {
        one();
    }

    private static void one() {
        System.out.println("Recursion");
        one();
    }
}

/*
StackOverflowError
Результат работы программы:

- Вылетит StackOverflowError
- Вылетит OutOfMemoryError
- Код не скомпилируется
- Цикл будет вечно печатать "Recursion"
 */

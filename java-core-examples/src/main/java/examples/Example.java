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

package examples;

public class DivideDouble {
    public static void main(String[] args) {
        double first = 1.0;
        double second = 2.0;
        while (first != 0) {
            first = first / second;
            System.out.println(first);
        }

        System.out.println(1.0/0.0);
        System.out.println(-1.0/0.0);
        System.out.println(0.0/0.0);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Double.MAX_VALUE > Long.MAX_VALUE);
    }
}

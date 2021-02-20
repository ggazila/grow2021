package examples;

public class ImmutableExample {
    public static void main(String[] args) {
        Integer first = 1000;
        Integer second = 1000;
        Long l1= 1000L;
        Long l2= 1000L;
        System.out.println(first == second);
        System.out.println(l1 == l2);
    }
}

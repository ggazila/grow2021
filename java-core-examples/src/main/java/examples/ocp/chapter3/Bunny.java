package examples.ocp.chapter3;

public class Bunny {
    static interface Rabbit {}
    static class FlemishRabbit implements Rabbit {}

    private static void hop(Rabbit rabbit) {
        System.out.println("hop");
    }

    private static void hop(FlemishRabbit rabbit) {
        System.out.println("HOP");
    }

    public static void main(String[] args) {
        Rabbit r1 = new FlemishRabbit();
        FlemishRabbit r2 = new FlemishRabbit();
        hop(r1);
        hop(r2);

    }
}

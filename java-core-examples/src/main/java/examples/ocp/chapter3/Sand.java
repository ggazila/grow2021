package examples.ocp.chapter3;

public class Sand {
    private static int numShovels;
    private int numRakes;

    public Sand() {
        System.out.print("a");
    }

    public static int getNumShovels() {
        return numShovels;
    }

//    public static int getNumRakes() {
//        return numRakes;
//    }

    public static void main(String... args) {
        new Sand().run();

    }

    public void Sand() {
        System.out.print("b");
    }

    public void run() {
        new Sand();
        Sand();
    }
}

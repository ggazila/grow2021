package examples.ocp.chapter3;

interface Flavor {
    public static final int a = 5;
    private static void excited() {
        //        printFlavor("Peanut butter");
    }

    public static void sad() {
        //        printFlavor("Butter pecan");
    }

    public default void happy() {
        printFlavor("Rocky road");
    }

    private void printFlavor(String f) {
        System.out.println(f);
    }
}

public class IceCream implements Flavor {
    @Override
    public void happy() {
        //        printFlavor("AAA");
    }
}

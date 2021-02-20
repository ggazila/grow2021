package examples.interfaces;

public interface InterfaceExample1 {
    static void printName() {
        System.out.println(InterfaceExample1.class.getName());
    }

    default void printDefault1() {
        System.out.println("default " + InterfaceExample1.class.getName());
    }

}

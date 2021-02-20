package examples.interfaces;

public interface InterfaceExample2 {
    static void printName() {
        System.out.println(InterfaceExample2.class.getName());
    }

    default void printDefault() {
        System.out.println("default " + InterfaceExample2.class.getName());
    }
}

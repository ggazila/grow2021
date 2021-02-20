package examples.interfaces;

public class TestInterfaces implements InterfaceExample1, InterfaceExample2 {
    public static void main(String[] args) {
        InterfaceExample1.printName();
        InterfaceExample2.printName();
        new TestInterfaces().printDefault();
        new TestInterfaces().printDefault1();

    }

    @Override
    public void printDefault() {
        System.out.println("implement default");
    }
}

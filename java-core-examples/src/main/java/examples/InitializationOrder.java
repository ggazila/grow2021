package examples;

public class InitializationOrder {
    static {
        System.out.println("static block");
    }

    {
        System.out.println("non-static block");
    }

    public InitializationOrder() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("main before creating object");
        InitializationOrder initializationOrder = new InitializationOrder();
        System.out.println("main after creating object");
    }
}

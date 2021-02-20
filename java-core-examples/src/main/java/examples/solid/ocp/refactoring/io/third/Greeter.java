package examples.solid.ocp.refactoring.io.third;

import java.io.PrintStream;

public class Greeter implements GreeterService{

    private PrintStream target;

    public Greeter(PrintStream target) {
        this.target = target;
    }

    public void greet() {
        target.println("Hello, World!");
    }
}

package examples.solid.ocp.refactoring.io.second;

import java.io.PrintStream;

public class Greeter {

    private PrintStream target;

    public Greeter(PrintStream target) {
        this.target = target;
    }

    public void greet() {
        target.println("Hello, World!");
    }
}

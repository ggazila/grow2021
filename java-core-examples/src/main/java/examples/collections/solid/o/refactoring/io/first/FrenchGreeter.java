package examples.collections.solid.o.refactoring.io.first;

import examples.solid.ocp.refactoring.io.first.Greeter;

public class FrenchGreeter extends Greeter {

    @Override
    public void greet() {
        System.out.println("Bonjour!");
    }
}

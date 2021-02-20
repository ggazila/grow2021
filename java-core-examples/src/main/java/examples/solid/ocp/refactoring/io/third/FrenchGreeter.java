package examples.solid.ocp.refactoring.io.third;

public class FrenchGreeter implements GreeterService {

    @Override
    public void greet() {
        System.out.println("Bonjour!");
    }
}

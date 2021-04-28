package examples.ocp.chapter4;

class Chair {
    public void sit() throws IllegalArgumentException {
        System.out.print("creek");
        throw new RuntimeException();
    }
}

public class Stool extends Chair {
    public static void main(String... c) throws Exception {
        try {
            new Stool().sit();
        } finally {
            System.out.print("?");
        }
    }

    public void sit() throws RuntimeException {
        System.out.print("thud");
    }
}

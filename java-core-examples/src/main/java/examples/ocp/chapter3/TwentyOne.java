package examples.ocp.chapter3;

public class TwentyOne {
    public int two = 2;
    private int one = 1;
}

class Child extends TwentyOne {
//    public int two = 22;

    public Child() {
        System.out.println(this.two);
    }

    public static void main(String[] args) {
        Child child = new Child();

    }
}

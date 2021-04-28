package examples.ocp.chapter3;

public class Computer {
    public void startup() {
        System.out.println("computer-");
    }

    public static void main(String[] args) {
        Computer computer = new Laptop();
        Laptop laptop = new Laptop();
        computer.startup();
        laptop.startup();
    }
}

class Laptop extends Computer {
    @Override
    public void startup() {
        System.out.println("laptop-");
    }
}

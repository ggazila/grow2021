package examples;

public class Parent {
    {
        System.out.println(1);
    }

    static {
        System.out.println(2);
    }

    public Parent() {
        System.out.println(3);
    }

    {
        System.out.println(4);
    }
}

class Child extends Parent {
    {
        System.out.println(5);
    }

    static {
        System.out.println(6);
    }

    public Child() {
        System.out.println(7);
    }

    {
        System.out.println(8);
    }

    public static void main(String[] args) {
        System.out.println(9);
        Child child = new Child();
        System.out.println(10);
    }
}

/*
9 1 2 3 4 5 6 7 8 10
2 6 9 1 4 3 5 8 7 10
2 6 1 3 4 5 7 8 9 10
9 6 2 5 8 7 1 4 3 10
 */

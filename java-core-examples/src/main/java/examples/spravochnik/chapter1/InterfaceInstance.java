package examples.spravochnik.chapter1;

public class InterfaceInstance extends Parent implements MyInterface {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            @Override
            public void doNothing() {
                MyInterface.super.doNothing();
            }

            @Override
            public void doN() {

            }
        };

    }

    @Override
    public void doN() {

    }
}

abstract class Parent {
    abstract void doN();
}

interface MyInterface {
     default void doNothing() {

    }
    void doN();
}

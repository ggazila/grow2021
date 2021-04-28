package examples.ocp.chapter3;

public class ThirtyFive {
    public static void main(String[] args) {
        //anonymous class
        new Runnable() {
            @Override
            public void run() {

            }
        };
    }

    void a() {
        abstract class LocalClass {

        }
    }

    final static class StaticNested {

    }

    abstract class MemberInnerClass {
    }
}

package examples.ocp.chapter3;

public class ParkRanger {
    int birds = 10;

    public static void main(String[] args) {
        var trees = 5;
        //        doesn't compile. static method cannot access non-static variable
        //        System.out.println(trees+birds);
    }
}

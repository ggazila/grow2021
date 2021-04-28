package examples.ocp.chapter3;

enum Direction {north, south, east, west;}

public class Ship {
    public static void main(String[] args) {
        System.out.println(Direction.valueOf(args[0]));
    }
}

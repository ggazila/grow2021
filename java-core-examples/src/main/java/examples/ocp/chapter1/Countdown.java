package examples.ocp.chapter1;

public class Countdown {
    public static void main(String[] args) {
        var builder = new StringBuilder("54321");
        builder.substring(2);
        System.out.println(builder.charAt(1));
    }
}

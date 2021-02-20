package examples;

public class BooleanExamples {
    public static void main(String[] args) {
        System.out.println(booleanExpression(true, false, true, false));
        System.out.println(booleanExpression(true, false, false, false));
        System.out.println(booleanExpression(false, true, false, true));
        System.out.println(booleanExpression(true, true, true, true));
    }

    private static boolean booleanExpression(boolean a, boolean b, boolean c,
            boolean d) {
        System.out.println("a ^ b " + (a ^ b));
        System.out.println("c ^ d " + (c ^ d));
        System.out.println("a ^ c " + (a ^ c));
        System.out.println("b ^ d " + (b ^ d));

        return a ^ b && c ^ d || a ^ c && b ^ d;
    }
}

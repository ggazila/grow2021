package examples.ocp.chapter4;

public class Football {
    public static void main(String args[]) {
        try {
            System.out.println('a');
            throw new ArrayIndexOutOfBoundsException();
        } catch (RuntimeException r) {
            System.out.println('b');
            throw r;
        } catch (Exception e) {
            System.out.println('c');
        } finally {
            System.out.println('d');
        }
    }
}

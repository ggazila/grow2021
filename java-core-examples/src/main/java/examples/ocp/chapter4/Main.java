package examples.ocp.chapter4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        one();
        two();
    }

    private static void two() {
//        try (Scanner s = new Scanner(System.in)) {
//            System.out.print(1);
//            s.nextLine();
//            System.out.print(2);
//            s = null;
//        } catch (IllegalArgumentException | NullPointerException x) {
//            s.nextLine();
//            System.out.print(3);
//        } finally {
//            s.nextLine();
//            System.out.print(4);
//        }
//        System.out.print(5);
    }

    private static void one() throws IOException {
        try (Scanner scanner = new Scanner(File.createTempFile("a", "b"))) {
            System.out.println("aaa");
        }
    }
}

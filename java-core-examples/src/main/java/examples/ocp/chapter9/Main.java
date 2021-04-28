package examples.ocp.chapter9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        three();
        six();
        eight();
    }

    private static void eight() throws IOException {
        var p1 = Path.of("baseball.txt");
        var p2 = Path.of("/home");
        var p3 = Path.of("/away");
        Files.createDirectories(p1);
        Path resolve = p3.resolve(p1);
        System.out.println(resolve);
        Files.copy(resolve, p2);
    }

    private static void six() {
        Path p1 = Path.of("./found/../keys");
        Path p2 = Paths.get("/lost/blue.txt");
        System.out.println(p1.resolve(p2));
        System.out.println(p2.resolve(p1));
    }

    private static void three() {
        String fn = "icecream.txt";
        try (var w = new BufferedWriter(
                new FileWriter(fn)); var s = System.out) {
            w.write("ALERT!");
            w.flush();
            w.write('!');
            System.out.print("1");
        } catch (IOException e) {
            System.out.print("2");
        } finally {
            System.out.print("3");
        }
    }
}

//package examples.ocp.chapter14.exam1;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//
//public class ReadEverything {
//    public void readFile(Path path) {
//        try {
//            Files.readAllLines(path)
//                    .parallel()
//                    .forEach(System.out::println);
//        } catch (Exception e) {}
//    }
//
//    public void read(Path directory) throws Exception {
//        Files.walk(directory)
//                .filter(p -> File.isRegularFile(p))
//                .forEach(x -> readFile(x));
//    }
//
//    public static void main(String[] args) throws IOException {
//        Path p = Path.get("collection");
//        new ReadEverything().read(p);
//    }
//}

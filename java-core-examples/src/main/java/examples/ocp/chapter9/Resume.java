//package examples.ocp.chapter9;
//
//import java.nio.file.Files;
//import java.nio.file.Path;
//
//public class Resume {
//    public void writeResume() throws Exception {
//        var f1 = Path.of("/templates/proofs");
//        f1.createDirectories();
//        var f2 = Path.of("/templates");
//        f2.createDirectory(); // k1
//        try(var w = Files.newBufferedWriter(
//                Path.of(f2.toString(), "draft.txt"))) {
//            w.append("My dream job");
//            w.flush();
//        }
//        f1.delete(f1);
//        f2.delete(f2);        // k2
//    }
//
//    public static void main(String... leads) {
//        try {
//            new Resume().writeResume();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } } }

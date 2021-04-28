//package examples.ocp.chapter4;
//
//class Garden implements AutoCloseable {
//    private final int g;
//
//    public Garden(int g) {
//        this.g = g;
//    }
//
//    public void close() throws Exception {
//        System.out.println(g);
//    }
//}
//
//public class Salad {
//    public static void main(String[] args) throws Exception {
//        var g = new Garden(5);
//        try (g; var h = new Garden(4); var i = new Garden(2)) {
//
//        } finally {
//            System.out.println(9);
//        }
//        g = null;
//    }
//}

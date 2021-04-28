//package examples.ocp.chapter4;
//
//public class Sleep {
//    public static void snore() {
//        try {
//            String sheep[] = new String[3];
//            System.out.print(sheep[3]);
//        } catch (RuntimeException | Error e) {
//            System.out.print("Awake!");
//        } finally {
//            throw new Exception();                // x1
//        }
//    }
//
//    public static void main(String… sheep) {  // x2
//        new Sleep().snore();                     // x3
//    }
//}

package examples;

public class Even {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if ((i | 1) > i) {
                System.out.println(i);
            }
        }
    }
}

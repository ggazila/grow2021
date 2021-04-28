package examples.ocp.chapter4;

import java.io.IOException;

public class Remember {
    public static void think() throws IOException {
        try {
//            throw Exception();
        } catch (RuntimeException r) {
        }
    }

    public static void main(String[] args) throws Exception {
        think();
    }
}

package examples.collections;

import java.util.IdentityHashMap;

public class IdentityMapExample {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
    }
}

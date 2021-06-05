package task.java.seven;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyLanguages {
    public static List<String> myLanguages(final Map<String, Integer> results) {
        return results.entrySet().stream()
                .sorted((o1, o2) -> o2.getValue() - o1.getValue())
                .filter(s -> s.getValue() >= 60).map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}

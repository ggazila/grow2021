package examples.singleton;

public class SingletonEager {
    private static final SingletonEager sc = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return sc;
    }
}

package examples.singleton;

public class SingletonLazyMultithreaded {
    private static SingletonLazyMultithreaded sc = null;

    private SingletonLazyMultithreaded() {
    }

    public static SingletonLazyMultithreaded getInstance() {
        if (sc == null) {
            synchronized (SingletonLazyMultithreaded.class) {
                if (sc == null) {
                    sc = new SingletonLazyMultithreaded();
                }
            }
        }

        return sc;
    }
}

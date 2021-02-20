package examples.singleton;

import java.io.Serializable;

public class SingletonSerializable implements Serializable {

    private static final long serialVersionUID = -1093810940935189395L;
    private static SingletonSerializable sc = new SingletonSerializable();

    private SingletonSerializable() {
        if (sc != null) {
            throw new IllegalStateException("Already created.");
        }
    }

    public static SingletonSerializable getInstance() {
        return sc;
    }

    private static Class getClass(String className)
            throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread()
                .getContextClassLoader();
        if (classLoader == null) {
            classLoader = SingletonSerializable.class.getClassLoader();
        }

        return classLoader.loadClass(className);
    }

    private Object readResolve() {
        return sc;
    }

    private Object writeReplace() {
        return sc;
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}

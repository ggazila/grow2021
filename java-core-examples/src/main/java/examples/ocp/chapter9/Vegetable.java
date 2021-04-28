package examples.ocp.chapter9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Vegetable implements Serializable {
    private Integer size = 1;
    private transient String name = "Red";

    {
        size = 3;
        name = "Purple";
    }

    public Vegetable() {
        this.size = 2;
        name = "Green";
    }

    public static void main(String[] args) throws Throwable {
        try (var o = new ObjectOutputStream(
                new FileOutputStream("healthy.txt"))) {
            final var v = new Vegetable();
            v.size = 4;
            o.writeObject(v);
        }

        try (var o = new ObjectInputStream(
                new FileInputStream("healthy.txt"))) {
            var v = (Vegetable) o.readObject();
            System.out.println(v.size + "," + v.name);
        }
    }
}

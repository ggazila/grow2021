package examples.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Set;

public class IteratorExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(new Random().nextInt(1000));
        }

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(1000));
        }

        Iterator<Integer> iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        ListIterator<Integer> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(
                    listIterator.next() + " => " + listIterator.nextIndex());
        }
    }
}

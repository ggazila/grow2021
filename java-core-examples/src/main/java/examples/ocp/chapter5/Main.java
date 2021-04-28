package examples.ocp.chapter5;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        one();
        three();
        six();
        thirteen();
        fourteen();
        twenty();
        twentyOne();
        twentySix();
        thirtySix();
        fortyTwo();
        seventy();
    }

    private static void seventy() {
        Queue<String> q = new ArrayDeque<>();
        q.add("snowball");
//        q.addL
    }

    private static void fortyTwo() {
        var ints = new int[] { 3, 1, 4 };
        var others = new int[] { 2, 7, 1, 8 };
        System.out.println(Arrays.compare(ints, others));
    }

    private static void thirtySix() {
        List<Integer> objects = new ArrayList<>();
        List<Integer> integers = List.copyOf(objects);
        List<List<Integer>> objects1 = List.of(objects);
        Set<Integer> integers1 = Set.copyOf(objects);
        Set<List<Integer>> objects2 = Set.of(objects);
    }

    private static void twentySix() {
        var linux = new String[] { "Linux", "Mac", "Windows" };
        var mac = new String[] { "Mac", "Linux", "Windows" };

        var search = Arrays.binarySearch(linux, "Linux");
        var mismatch1 = Arrays.mismatch(linux, mac);
        var mismatch2 = Arrays.mismatch(mac, mac);
        System.out.println(search + " " + mismatch1 + " " + mismatch2);
    }

    private static void twentyOne() {
        var x = new LinkedList<Integer>();
        x.offer(18);
        x.offer(5);
        x.push(13);
        System.out.println(x.poll() + " " + x.poll());
    }

    private static void twenty() {
        var nums = new HashSet<Long>();
        nums.add((long) Math.min(5, 3));
        nums.add(Math.round(3.14));
        nums.add((long) Math.pow(4, 2));
        System.out.println(nums);
    }

    private static void fourteen() {
        var list = new ArrayList<Integer>();
        list.add(56);
        list.add(56);
        list.add(3);
        var set = new TreeSet<Integer>(list);
        System.out.println(set.size());
        System.out.println(" ");
        System.out.println(set.iterator().next());
    }

    private static void thirteen() {
        //        [][]String alpha;
        //   []String beta;
        String[][] gamma;
        String[] delta[];
        String epsilon[][];
        //        var[][]zeta;
    }

    private static void six() {
        var q = new ArrayDeque<String>();
        q.offer("snowball");
        q.offer("minnie");
        q.offer("sugar");
        System.out.println(q.peek() + " " + q.peek() + " " + q.size());
    }

    private static void three() {
        //        List<String> strings = new ArrayList<?>();
        var ints = new HashSet<Integer>();
        Double db1 = 5.0;
        ints.add(2);
        ints.add(null);
    }

    private static void one() {
        //        []String lions = new String[];
        //        String[] tigers = new String[1] {"tiger"};
        String bears[] = new String[] {};
        //        String ohMy [] = new String[0] {};
    }
}

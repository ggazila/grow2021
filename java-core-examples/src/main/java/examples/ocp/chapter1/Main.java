package examples.ocp.chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        third();
        four();
        ten();
        fifteen();
        sixteen();
        twentyOne();
        twentyEight();
        twentyNine();
    }

    private static void twentyNine() {
        var babies = Arrays.asList("chick", "cygnet", "duckling");
        babies.replaceAll(x -> {
            var newValue = "baby";
            return newValue;
        });
        System.out.println(babies);
    }

    private static void twentyEight() {
        boolean carrot = true;
        boolean potato = false;
        var broccoli = true;
        carrot = carrot & potato; //false
        broccoli = broccoli ? !carrot : potato; //true
        potato = !broccoli ^ carrot; //false
        System.out.println(carrot + "," + potato + "," + broccoli);

    }

    private static void twentyOne() {
        //        var sb = new StringBuilder("radical").insert(sb.length(), "robots");
        //        System.out.println(sb);
    }

    private static void sixteen() {
        var happy = " :) - :( ";
        var really = happy.trim();
        var question = happy.substring(1, happy.length() - 1);
        System.out.println(question);
        System.out.println(really.equals(question));
    }

    private static void fifteen() {
        var list = new ArrayList<Integer>();
        list.add(10);
        list.add(9);
        list.add(8);

        var num = 9;
        list.removeIf(x -> {
            int keep = num;
            return x != keep;
        });
        System.out.println(list);
        list.removeIf(x -> {
            int keep = num;
            return x == keep;
        });
        System.out.println(list);
    }

    private static void ten() {
        Comparator<String> c1 = (j, k) -> 0;
        Comparator<String> c2 = (String j, String k) -> 0;
        //        Comparator<String> c3 = (var j, String k) -> 0;
        //        Comparator<String> c4 = (var j, k) -> 0;
        Comparator<String> c5 = (var j, var k) -> 0;

    }

    private static void four() {
        var line = new StringBuilder("-");
        var anotherLine = line.append("-");
        System.out.print(line == anotherLine);
        System.out.print(" ");
        System.out.print(line.length());
        System.out.println();
    }

    private static void third() {
        var q = 4.0f;
        System.out.println(q);
    }
}

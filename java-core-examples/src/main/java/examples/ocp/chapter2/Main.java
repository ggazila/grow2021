package examples.ocp.chapter2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        two();
        //        three();
        nine();
        eleven();
        fifteen();
        twenty();
        thirteen();
    }

    private static void thirteen() {
        final var javaVersions = List.of(9, 10, 11);
        var exams = List.of("1Z0-811", "1Z0-819");
        V:
        for (var e1 : javaVersions) {
            E:
            for (var e2 : exams)
                System.out.println(e1 + "_" + e2);
                break;

        }
    }

    private static void twenty() {
        int count = 0;
        var stops = new String[] { "Washington", "Monroe", "Jackson",
                "LaSalle" };
        while (count < stops.length)
            if (stops[++count].length() < 8)
                break;
            else
                continue;
        System.out.println(count);
    }

    private static void fifteen() {
        //        do {
        //            int trick = 0;
        //            LOOP:
        //            do {
        //                trick++;
        //            } while (trick < 2--);
        //            continue LOOP;
        //        } while (1 < 2);
        //        System.out.println(trick);
    }

    private static void eleven() {
        var bottles = List.of("glass", "plastic", "can");
        for (int type = 1; type < bottles.size(); ) {
            System.out.print(bottles.get(type) + "-");
            if (type < bottles.size())
                break;
        }
        System.out.println("end");
    }

    private static void nine() {
        var race = "";
        loop:
        do {
            race += "x";
            break loop;
        } while (true);
        System.out.println(race);
    }

    private static void three() {
        int m = 0, n = 0;
        while (m < 5) {
            n++;
            if (m == 3) {
                continue;
            }

            switch (m) {
            case 0:
            case 1:
                n++;
            default:
                n++;
            }
            m++;
        }
        System.out.println(m + " " + n);
    }

    private static void two() {
        var gas = true;
        do {
            System.out.println("helium");
            gas = gas ^ gas;
            gas = !gas;
        } while (!gas);
    }
}

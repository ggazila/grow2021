package examples.ocp.chapter3;

public class Watch {
    public static void main(String[] args) {
        var watch = new Watch();
        var smartWatch = new SmartWatch();
        System.out.println(watch.getName(","));
        System.out.println(smartWatch.getName(","));
    }

    private String getType() {
        return "watch";
    }

    public String getName(String suffix) {
        return getType() + suffix;
    }
}

class SmartWatch extends Watch {
    private String getType() {
        return "smartWatch";
    }

    public String getName(String suffix) {
        return getType() + suffix;
    }
}

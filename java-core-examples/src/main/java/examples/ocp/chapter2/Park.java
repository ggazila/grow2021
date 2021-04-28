package examples.ocp.chapter2;

public class Park {
    public final static void main(String... arguments) {
        int pterodactyl = 8;
        long triceratops = 3;
        if (pterodactyl % 3 > 1 + 1)
            triceratops++;
        triceratops--;
        System.out.print(triceratops);
    }
}

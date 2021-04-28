package examples.ocp.chapter3;

public class Chicken {
    private Integer eggs = 2;

    {
        this.eggs = 3;
    }

    public Chicken(int eggs) {
        this.eggs = eggs;
    }

    public static void main(String[] args) {

    }
}

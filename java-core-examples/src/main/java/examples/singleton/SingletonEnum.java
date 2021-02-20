package examples.singleton;

public class SingletonEnum {
    public static void main(String[] args) {
        System.out.println(SingleEnum.SINGLE_ENUM);
    }

    public enum SingleEnum {
        SINGLE_ENUM;
    }
}

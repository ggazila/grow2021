package examples.ocp.chapter3;

public interface Swimming {
    String DEFAULT = "Diving";

    //CAN'T - final, interface, protected
    //CAN -
    abstract int breath();
    private static void stroke() {
        //I cannot call non-static method from static method
//        if (breath() == 1) {
//
//        }
    }
}

class Tool {
    private void repair() {

    }
    void use() {

    }
}

class Hammer extends Tool {
    private int repair() {
        return 0;
    }

//    private void use() {
//
//    }
}

package examples.ocp.chapter3;

interface Building {
    default Double getHeight() {
        return 1.0;
    }
}

interface Office {
    public default String getHeight() {
        return null;
    }
}

//abstract class Tower implements Building, Office {
//}
//
//public class Restaurant extends Tower {
//}

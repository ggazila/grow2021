package examples.ocp.chapter3;

public class Bottle {
    public static class Ship {
        private enum Sail {
            TALL {protected int getHeight() {return 100;}},
            SHORT {protected int getHeight() {return 2;}};
            protected abstract int getHeight();
        }

        public Sail getSail() {
            return Sail.TALL;
        }

        public static void main(String[] args) {
            var bottle = new Bottle();
//            Ship q = bottle.new Ship();
        }
    }
}

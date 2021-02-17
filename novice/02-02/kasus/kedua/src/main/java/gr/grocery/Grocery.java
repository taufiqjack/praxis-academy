package gr.grocery;

import java.util.List;

/**
 * Grocery
 */
public class Grocery {

    static class Plant {
        private String name;

        public Plant(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    static class Fruit extends Plant {
        private int size;

        public Fruit(String name, int size) {
            super(name);
            this.size = size;
        }

        public int getSize() {
            return size;
        }

    }

    static class Apple extends Fruit {
        private String origin;

        public Apple(String name, int size, String origin) {
            super(name, size);
            this.origin = origin;
        }

        public String getOrigin() {
            return origin;
        }
    }

}
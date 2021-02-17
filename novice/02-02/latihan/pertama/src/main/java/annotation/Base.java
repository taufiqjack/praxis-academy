package annotation;

/**
 * Base
 */
public class Base {

    public void Display() {
        System.out.println("Base display()");
    }
    public static void main(String[] args) {
        Base t1 = new Derived();
        t1.Display();
    }
}

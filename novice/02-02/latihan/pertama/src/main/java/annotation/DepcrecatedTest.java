package annotation;

public class DepcrecatedTest {
    @Deprecated
    public void Display() {
        System.out.println("DeprecatedTest display()");
    }

    public static void main(String[] args) {
        DepcrecatedTest d1 = new DepcrecatedTest();
        d1.Display();
    }
}

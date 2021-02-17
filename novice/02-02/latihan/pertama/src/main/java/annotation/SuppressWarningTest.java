package annotation;

public class SuppressWarningTest {
    @SuppressWarnings({ "checked", "deprecation" })
    public static void main(String[] args) {
        DepcrecatedTest d1 = new DepcrecatedTest();

        d1.Display();

    }
}

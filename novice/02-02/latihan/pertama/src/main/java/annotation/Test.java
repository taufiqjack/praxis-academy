package annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Test
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@interface TestAnnotation {
    String Developer() default "Rahul";

    String ExpiryDate();
}

public class Test {

    @TestAnnotation(Developer = "data", ExpiryDate = "01-10-2020")
    void fun1() {
        System.out.println("Test medthod 1");
    }

    @TestAnnotation(Developer = "fair", ExpiryDate = "01-10-2020")
    void fun2() {
        System.out.println("Test method 2");
    }

    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
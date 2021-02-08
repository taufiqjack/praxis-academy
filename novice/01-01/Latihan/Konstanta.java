public class Konstanta {

    // public static void main(String[] args) {
    // int a, b;
    // a = 10;
    // b = (a == 1) ? 20 : 30;
    // System.out.println("Value of b is : " + b);

    // b = (a == 10) ? 20 : 30;
    // System.out.println("Value of b is : " + b);
    // }

    // public static void main(String[] args) {
    // String name = "James";

    // boolean result=name instanceof String;
    // System.out.println(result);

    // }

    class Vehicle {
    }

    public class Car extends Vehicle {
        
        public static void main(String[] args) {
            
            Vehicle a = new Car();
            boolean result = a instanceof Car;
            System.out.println(result);
        }
    }
}

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Condition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our calculator");
        System.out.println("Enter the first number : ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the second number : ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Choose one of the following operations : ");
        System.out.println("1 - Addition");
        System.out.println("2 - Substrction");
        System.out.println("3 - multiplication");
        System.out.println("4 - division");
        int option = Integer.parseInt(scanner.nextLine());

        double result = 0;
        if (option == 1) {
            result = a + b;
        } else if (option == 2) {
            result = a - b;
        } else if (option == 3) {
            result = a * b;
        } else if (option == 4) {
            result = a / b;
        }
        if ((option > 0) && (option < 5)) {
            System.out.println("Result : " + result);
        } else {
            System.out.println("invalid option!");
        }
        System.out.println("thanks you for using our calculator");
    }

}

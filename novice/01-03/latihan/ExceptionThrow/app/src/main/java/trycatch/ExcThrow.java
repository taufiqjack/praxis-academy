package trycatch;

/**
 * ExcThrow
 */
public class ExcThrow {

    static int divideByZero(int a, int b) {
        int i = a / b;
        return i;
    }

    static int computeDivision(int a, int b){
        int res = 0;

        try {
            res = divideByZero(a, b);
        } catch (NumberFormatException ex) {
            //TODO: handle exception
            System.out.println("Number FOrmatException is occured");
        }
        return res;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 1;

        try {
            int i =computeDivision(a, b);
        } catch (ArithmeticException ex) {

            //TODO: handle exception
            System.out.println(ex.getMessage());
        }
    }
}
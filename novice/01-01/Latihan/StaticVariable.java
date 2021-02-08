public class StaticVariable {

    private static double salary;
    public static final String DEPARTMENT = "Development ";

    public static void main(String[] args) {
        salary = 1000;
        System.out.println(DEPARTMENT + "avarege salary: " + salary);
    }
}

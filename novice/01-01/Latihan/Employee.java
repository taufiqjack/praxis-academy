import javax.print.DocFlavor.STRING;

public class Employee {
    public String name;
    private double salary;

    public Employee(String empName){
        name = empName;
    }
    public void setSalary(double empSal){
        salary = empSal;
    }

    public void printEmp(){
        System.out.println("name : " + name);
        System.out.println("name : " + salary);
    }

    public static void main(String[] args) {
        Employee empOne = new Employee("Ransika");
        empOne.setSalary(1000);
        empOne.printEmp();
        

    }
}

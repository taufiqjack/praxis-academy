public class Variable {
    public void pubAge(){
        int age =0;
        age = age + 7;
        System.out.println("Pupy age is : "+ age);
    }

    public static void main(String[] args) {
        Variable variable = new Variable();
        variable.pubAge();
    }
}

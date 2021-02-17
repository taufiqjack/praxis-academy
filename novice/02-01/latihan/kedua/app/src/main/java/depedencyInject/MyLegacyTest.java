package depedencyInject;

public class MyLegacyTest {
    public static void main(String[] args) {
        MyApplication app = new MyApplication(null);
        app.processMessage("Hi Pakaj", "pankaj@abc.com");
    }
}

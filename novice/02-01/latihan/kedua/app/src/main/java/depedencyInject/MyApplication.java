package depedencyInject;


/**
 * MyApplication
 */
public class MyApplication {

    //private EmailService email = new EmailService();
    private EmailService email = null;

    public MyApplication(EmailService svc) {
        this.email = svc;
    }

    public void processMessage(String msg, String rec) {
        this.email.sendEmail(msg, rec);
    }
}
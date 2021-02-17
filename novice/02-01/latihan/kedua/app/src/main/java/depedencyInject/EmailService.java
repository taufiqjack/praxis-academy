package depedencyInject;

/**
 * EmailService
 */
public class EmailService {

    public void sendEmail(String message, String receiver) {
        System.out.println("Email sent to " + receiver + "with Message = " + message);
    }
}
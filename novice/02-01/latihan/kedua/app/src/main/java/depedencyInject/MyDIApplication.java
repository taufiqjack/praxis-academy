package depedencyInject;

/**
 * MyDIApplication
 */
public class MyDIApplication implements Consumer {

    private MessageService service;

    public MyDIApplication() {
    }

    public MyDIApplication(MessageService svc) {
        this.service = svc;
    }

    @Override
    public void processMessage(String msg, String rec) {
        this.service.sendMessage(msg, rec);
    }

	public void setService(EmailServiceImp emailServiceImp) {
	}

}
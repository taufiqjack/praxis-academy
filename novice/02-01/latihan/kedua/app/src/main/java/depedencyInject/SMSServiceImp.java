package depedencyInject;

public class SMSServiceImp {
    public void sendMessage(String msg, String rec){
        System.out.println("SMS sent to "+rec+"with message ="+msg);
    }
}

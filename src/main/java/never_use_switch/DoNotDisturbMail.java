package never_use_switch;

public class DoNotDisturbMail extends MailInfoWithoutSwitch {

    @Override
    public void send() {
        //45 lines of code
        System.out.println("don't call us we call you. was generated and sent to " + super.recipient.getEmail());
    }
}

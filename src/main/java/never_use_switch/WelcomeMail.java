package never_use_switch;

public class WelcomeMail extends MailInfoWithoutSwitch {

    public void send() {
        //40 lines of code
        System.out.println("welcome mail was generated and sent to " + super.recipient.getEmail());
    }
}

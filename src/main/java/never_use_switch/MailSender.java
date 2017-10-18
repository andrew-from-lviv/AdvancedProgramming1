package never_use_switch;



public class MailSender {

    public void sendMail(MailInfo mailInfo) {

        switch (mailInfo.getMailCode()) {
            case 1:
                //40 lines of code
                System.out.println("welcome mail was generated and sent to " + mailInfo);
                break;
            case 2:
                //45 lines of code
                System.out.println("don't call us we call you. was generated and sent to " + mailInfo);
                break;
        }
    }

    /**
     * Sender which is not using a switch statement
     * @param mailInfo any concrete email which is inherited from MailInfoWithoutSwitch class
     */
    public void sendMailWithoutSwitch(MailInfoWithoutSwitch mailInfo) {
        mailInfo.send();
    }
}

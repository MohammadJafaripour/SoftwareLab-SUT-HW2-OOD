package services;

public class SmsSender implements MessageSender {
    @Override
    public void sendEmail(String to, String message) {
    }
    @Override
    public void sendSmsMessage(String mobile, String message) {
        System.out.println("Sending SMS to " + mobile + ": " + message);
    }
}
package services.notification;

public class SmsSender implements MessageSender {
    @Override
    public void send(String destination, String message) {
        System.out.println("Sending SMS to " + destination + ": " + message);
    }
}
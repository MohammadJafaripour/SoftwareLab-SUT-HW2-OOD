package services;

public interface MessageSender {
    public void sendEmail(String to, String message);
    public void sendSmsMessage(String mobile, String message); // Added
}

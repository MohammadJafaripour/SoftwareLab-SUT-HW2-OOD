package services.notification;

public interface MessageSender {
    void send(String destination, String message);
}
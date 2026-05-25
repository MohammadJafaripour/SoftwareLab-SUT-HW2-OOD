package services;

class EmailSender implements MessageSender {
    public void sendEmail(String to, String message) {
        System.out.println("Sending email to " + to + ": " + message);
    }
    @Override
    public void sendSmsMessage(String mobile, String message) {
        // Empty
            }
}
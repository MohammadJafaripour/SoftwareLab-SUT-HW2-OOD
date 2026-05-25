package services.payment;

public class OnSitePayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid on-site (in-person): " + amount);
    }
}
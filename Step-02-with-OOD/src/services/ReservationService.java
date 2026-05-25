package services;

import models.Reservation;
import services.invoice.InvoicePrinter;
import services.notification.MessageSender;
import services.payment.PaymentStrategy;

public class ReservationService {
    private InvoicePrinter invoicePrinter;

    // رعایت DIP و CRP از طریق Injection
    public ReservationService(InvoicePrinter invoicePrinter) {
        this.invoicePrinter = invoicePrinter;
    }

    public void makeReservation(Reservation res, PaymentStrategy paymentMethod, MessageSender notifier, String contactInfo) {
        System.out.println("Processing reservation for " + res.getCustomer().getName());

        // بررسی تخفیف (بدون نقض PLK)
        if(res.getCustomer().getCity().equals("Paris")){
            System.out.println("Apply city discount for Paris!");
            res.applyDiscount(0.10); // 10% تخفیف
        }

        // پردازش پرداخت از طریق پولی‌مورفیسم (بدون نیاز به switch-case)
        paymentMethod.pay(res.calculateTotalPrice());

        // چاپ فاکتور (رعایت SRP)
        invoicePrinter.print(res);

        // ارسال اعلان (بدون نیاز به switch-case)
        notifier.send(contactInfo, "Your reservation is confirmed!");
    }
}
import models.Customer;
import models.LuxuryRoom;
import models.Reservation;
import models.Room;
import services.ReservationService;
import services.invoice.InvoicePrinter;
import services.notification.SmsSender;
import services.payment.PayPalPayment;

public class Main {
    public static void main(String[] args){
        Customer customer = new Customer("Ali", "ali@example.com","09124483765", "Paris");
        Room room = new LuxuryRoom("203", 150);
        Reservation res = new Reservation(room, customer, 2);

        ReservationService service = new ReservationService();
        service.makeReservation(res, PaymentMethods.PAYPAL, Notifier.EMAIL);
        
        // آماده‌سازی سرویس‌ها
        InvoicePrinter printer = new InvoicePrinter();
        ReservationService service = new ReservationService(printer);
        // تزریق وابستگی‌ها در زمان اجرا (Dependency Injection)
        service.makeReservation(
                res, 
                new PayPalPayment(), // تزریق استراتژی پرداخت
                new SmsSender(),     // تزریق استراتژی پیام‌رسانی
                customer.getMobile() // مسیر ارتباطی متناسب با استراتژی
        );
    }
}
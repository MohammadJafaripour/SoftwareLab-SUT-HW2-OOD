package services.invoice;

import models.Reservation;

public class InvoicePrinter {
    public void print(Reservation res) {
        System.out.println("----- INVOICE -----");
        System.out.println("Customer: " + res.getCustomer().getName());
        System.out.println("Room: " + res.getRoom().getNumber() + " (" + res.getRoom().getType() + ")");
        System.out.println("Total: " + res.calculateTotalPrice());
        System.out.println("-------------------");
    }
}
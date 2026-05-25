package models;

public class Reservation {
    private Room room;
    private Customer customer;
    private int nights;
    private double discountRate = 0.0; 
    public Reservation(Room r, Customer c, int nights) {
        this.room = r;
        this.customer = c;
        this.nights = nights;
    }

    public void applyDiscount(double percentage) {
        this.discountRate = percentage;
    }

    public double calculateTotalPrice(){
        double basePrice = room.getPrice() * nights;
        return basePrice - (basePrice * discountRate);
    }

    public Room getRoom() { return room; }
    public Customer getCustomer() { return customer; }
}
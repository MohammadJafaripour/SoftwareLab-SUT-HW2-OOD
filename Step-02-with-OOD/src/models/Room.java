package models;

public class Room {
    private String number;
    private String type;
    private double price;

    public Room(String number, String type, double price){
        this.number = number;
        this.type = type;
        this.price = price;
    }

    public String getNumber() { return number; }
    public String getType() { return type; }
    public double getPrice() { return price; }
}
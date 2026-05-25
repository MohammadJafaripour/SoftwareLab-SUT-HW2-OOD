package models;

public class Customer {
    private String name;
    private String email;
    private String mobile;
    private String city;

    public Customer(String name, String email, String mobile, String city){
        this.name = name; 
        this.email = email; 
        this.mobile = mobile; 
        this.city = city;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getMobile() { return mobile; }
    public String getCity() { return city; }
}
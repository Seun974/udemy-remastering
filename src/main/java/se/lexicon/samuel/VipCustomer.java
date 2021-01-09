package se.lexicon.samuel;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;
    //empty constructor below setting the values and it is calling the 3rd constructor
    public VipCustomer() {
        this("default name", 50000.00, "email@email.com");
    }
    //this also calls the 3rd constructor
    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }
    //this is saving the values into the fields
    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

package com.company;

public class VipCustomer {
    private String name;
    private String email;
    private double creditLimit;

    public VipCustomer() {
        this("default", "email", 100.00);
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, "email", creditLimit);
    }

    public VipCustomer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }


    public static void main(String[] args) {
        VipCustomer customer = new VipCustomer();
        System.out.println(customer.creditLimit);
    }
}

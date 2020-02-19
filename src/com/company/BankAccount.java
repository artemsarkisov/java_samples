package com.company;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private String name;
    private String email;
    private int phoneNumber;
    private String address;
    private int postalCode;
    private String city;
    private String state;
    private String country;
    private int taxId;
    private int creditRating;

    public BankAccount(int accountNumber, int balance, String name, String email, int phoneNumber, String address, int postalCode, String city, String state, String country, int taxId, int creditRating) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.state = state;
        this.country = country;
        this.taxId = taxId;
        this.creditRating = creditRating;
    }

    public BankAccount(int accountNumber, int balance, String name, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount() {
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFunds(int amount) {
        this.balance += amount;
        System.out.println(this.balance);
    }

    public void withdrawFunds(int amount) {
        if (this.balance - amount < 0) {
            System.out.println("You don't have enough funds");
        }
        this.balance -= amount;
        System.out.println(this.balance);
    }


}

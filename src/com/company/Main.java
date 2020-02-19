package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount(12345, 5000, "Arty", "arty@email.com", 15559966, "14th Street", 190000, "Ncity", "NVLND", "Unknown", 1600348, 5);

        BankAccount userAccount = new BankAccount();
        userAccount.setBalance(5000);
        System.out.println(userAccount.getBalance());
        userAccount.setName("John");
        System.out.println(userAccount.getName());
        userAccount.setEmail("john@example.com");
        System.out.println(userAccount.getEmail());
        userAccount.depositFunds(1000);
        System.out.println(myAccount.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();


        intList.add(2, 256);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.remove(1);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

    }
}


package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        BankAccount bankAccount = new BankAccount();
//        bankAccount.setBalance(5000);
//        System.out.println(bankAccount.getBalance());
//        bankAccount.setName("Arty");
//        System.out.println(bankAccount.getName());
//        bankAccount.setEmail("lol@lol.com");
//        System.out.println(bankAccount.getEmail());
//        bankAccount.depositFunds(1000);
//        System.out.println(bankAccount.getBalance());
//        bankAccount.withdrawFunds(500);
//        System.out.println(bankAccount.getBalance());

//        BankAccount myAccount = new BankAccount(12345, 10000, "Arty",
//                "arty@sark.com", 5556677);

//        VipCustomer customer = new VipCustomer();
//        System.out.println(customer.getName());
//        System.out.println(customer.getEmail());
//        System.out.println(customer.getCreditLimit());
//
//        VipCustomer me = new VipCustomer("Arty", 0.00);
//        System.out.println(me.getName());
//        System.out.println(me.getEmail());
//        System.out.println(me.getCreditLimit());
//
//        VipCustomer you = new VipCustomer("Arty", "lol@lol.com", 0.00);
//        System.out.println(you.getName());
//        System.out.println(you.getEmail());
//        System.out.println(you.getCreditLimit());

//        Printer printer = new Printer(40, 2, true);
//        System.out.println(printer.isDuplex());

        Man man = new Man("Arty", 28);
        Man anotherMan;
        anotherMan = man;
        anotherMan.setAge(105);
        System.out.println(man.getAge());


        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(2);
        intList.add(3);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

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

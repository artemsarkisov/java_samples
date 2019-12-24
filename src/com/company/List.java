package com.company;

import java.util.ArrayList;

public class List {

    public static void main(String[] args) {

        ArrayList<Integer> lol = new ArrayList<Integer>();
        lol.add(1);
        lol.add(2);
        lol.add(3);

        printLolDoubled(lol);

    }


    public static void printLolDoubled(ArrayList<Integer> list) {
        for (int i : list) {
            System.out.println(i * 2);
        }
    }

}

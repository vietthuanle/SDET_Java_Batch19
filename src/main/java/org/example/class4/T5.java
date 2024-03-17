package org.example.class4;

public class T5 {
    public static void main(String[] args) {
        double rate = 2.5;
        double price = 400000;
        if (rate < 4.5) {
            System.out.println("Customer will consider to buy a house");
            if (price > 100000) {
                System.out.println("Customer will take a loan");
            } else {
                System.out.println("Customer will pay cash");
            }
        } else {
            System.out.println("Customer will not consider buy a house");
        }
    }
}

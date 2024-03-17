package org.example.class5;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How much money do you want to borrow?");
        double amount = input.nextDouble();

        if (amount <= 200000){
            System.out.println("Loan amount accepted! Here is your money.");
        } else {
            System.out.println("That is too much money. I run a small business. Go to the bank for that kind of amount.");
        }
    }
}

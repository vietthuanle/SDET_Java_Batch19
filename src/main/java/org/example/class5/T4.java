package org.example.class5;

import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you have a credit card?");
        String answer = input.next();

        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("What is the balance on the credit card?");
            double balance = input.nextDouble();

            if (balance > 1000) {
                System.out.println("balance too high, you need to pay it off.");
            } else {
                System.out.println("That is a rookie number. You can still spend more");
            }
        } else if (answer.equalsIgnoreCase("no")) {
            System.out.println("Have you consider getting a credit card?");
        } else {
            System.out.println("Please enter only yes or no");
        }
    }
}

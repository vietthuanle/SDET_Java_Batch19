package org.example.class5;

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your total number of years you have worked");
        double year = input.nextDouble();

        System.out.println("Please enter your annual salary");
        double salary = input.nextDouble();

        if (year >= 5) {
            System.out.println("You are eligible for bonus");

            if (salary > 50000) {
                System.out.println("Your bonus is $5000");
            } else {
                System.out.println("Your bonus is $3000");
            }
        } else {
            System.out.println("You are not eligible for bonus");
        }
    }
}

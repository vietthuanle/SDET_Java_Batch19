package org.example.class5;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("Here is your driver license");
        } else {
            System.out.println("You are underage. You should get learners permit instead");
        }
    }
}

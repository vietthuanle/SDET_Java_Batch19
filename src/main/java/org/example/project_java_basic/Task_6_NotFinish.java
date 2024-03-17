package org.example.project_java_basic;

import java.util.Scanner;

public class Task_6_NotFinish {
    public static void main(String[] args) {

        //NOOOOOOOOOO

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();

        if (!(num == 2)) {
            if (!(num % 2 == 0) && !(num % 5 == 0)) {
                System.out.println("Maybe");
            } else {
                System.out.println(num + " is not a prime number");
            }
        } else {
            System.out.println(num + " is a prime number");
        }
    }
}

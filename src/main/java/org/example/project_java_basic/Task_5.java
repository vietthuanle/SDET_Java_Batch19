package org.example.project_java_basic;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1 = input.nextInt();
        System.out.println("Please enter the second number");
        int num2 = input.nextInt();

        System.out.println("Numbers entered:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("The 2 numbers are swapped place");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
    }
}

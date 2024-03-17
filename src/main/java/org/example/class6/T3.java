package org.example.class6;

import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number");
        double num1 = input.nextDouble();
        System.out.println("Please enter an operator (+,-,*,/)");
        char operator = input.next().charAt(0);
        System.out.println("Please enter second number");
        double num2 = input.nextDouble();

        switch (operator) {
            case '+':
                System.out.println(num2 + num1);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Operator not found");
        }

        if (operator == '+') {
            System.out.println(num2 + num1);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Operator not found");
        }
    }
}

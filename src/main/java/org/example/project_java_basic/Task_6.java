package org.example.project_java_basic;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();
        boolean isTrue = true;

        if (!(num == 2 || num == 3 || num == 5 || num == 7)) {
            if (num > 1 && !(num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0)) {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        isTrue = false;
                        break;
                    }
                }
                if (isTrue) {
                    System.out.println(num + " is a prime number");
                } else {
                    System.out.println(num + " is not a prime number");
                }
            } else {
                System.out.println(num + " is not a prime number");
            }
        } else {
            System.out.println(num + " is a prime number");
        }
    }
}

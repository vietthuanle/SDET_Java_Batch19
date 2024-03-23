package org.example.class11;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = in.nextLine();
        if (!str.isEmpty()) {
            if (str.length() % 2 != 0 && str.length() > 2) {
                System.out.println(str.charAt(str.length() / 2));
            }else {
                System.out.println("The string has even number of characters or less than 3 characters");
            }
        }else {
            System.out.println("The string is empty");
        }
    }
}

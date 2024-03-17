package org.example.class5;

import java.util.Scanner;

public class E1toE7Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("E1 Scanner");
        System.out.println("Enter your age");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You need to wait");
        }

        System.out.println("E2 Scanner");
        System.out.println("Enter a byte number");
        byte byteNum = input.nextByte();
        System.out.println("Enter a double number");
        double doubleNum = input.nextDouble();
        System.out.println("Enter a boolean value");
        boolean booleanValue = input.nextBoolean();
        System.out.println(byteNum);
        System.out.println(doubleNum);
        System.out.println(booleanValue);

        System.out.println("E3 Scanner");
        System.out.println("Enter your first name");
        String firstName = input.next();
        System.out.println(firstName);

        System.out.println("E4 Scanner");
        System.out.println("Enter your last name");
        String lastName = input.nextLine();
        System.out.println(lastName);

        System.out.println("E5 Scanner");
        System.out.println("enter the gender m/f");
        char gender = input.next().charAt(0);
        System.out.println(gender);

        System.out.println("E6 Scanner");
        System.out.println("enter your age");
        int age3=input.nextInt();
        System.out.println("Enter your full name");
        input.nextLine();
        String fullName = input.nextLine();
        System.out.println("Your name is "+fullName+" your are "+age3+" years old");

        System.out.println("E7 Scanner");
        System.out.println("enter your age");
        int age2=input.nextInt();
        System.out.println("Enter your full name");
        String fullName2 = input2.nextLine();
        System.out.println("Your name is "+fullName2+" your are "+age2+" years old");
    }
}

package org.example.class11;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter username: ");
        String user = in.nextLine();
        System.out.print("Enter password: ");
        String pass = in.nextLine();
        System.out.print("Confirm password: ");
        String confirmPass = in.nextLine();
        if (user.isEmpty() || pass.isEmpty()) {
            System.out.println("Username or Password cannot be empty");
        } else if (pass.length() < 8) {
            System.out.println("Password is too short");
        } else if (pass.contains(user)) {
            System.out.println("Password cannot contain username");
        } else if (!confirmPass.equals(pass)) {
            System.out.println("Passwords do not match");
        } else {
            System.out.println("Your username and password has been created");
        }
    }
}

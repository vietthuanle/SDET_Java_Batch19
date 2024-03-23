package org.example.class11;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Mom's first name? ");
        String mom = in.nextLine();
        System.out.print("Dad's first name? ");
        String dad = in.nextLine();
        System.out.print("Boy or Girl? ");
        String boyOrGirl = in.next();
        String baby = "";
        if (boyOrGirl.equalsIgnoreCase("boy")) {
            for (int i = 0; i < dad.length() / 2; i++) {
                baby += dad.charAt(i);
            }
            for (int i = (mom.length() / 2); i < mom.length(); i++) {
                baby += mom.charAt(i);
            }
            System.out.println(baby);
        } else if (boyOrGirl.equalsIgnoreCase("girl")) {
            for (int i = 0; i < mom.length() / 2; i++) {
                baby += mom.charAt(i);
            }
            for (int i = (dad.length() / 2); i < dad.length(); i++) {
                baby += dad.charAt(i);
            }
            System.out.println(baby);
        }
    }
}

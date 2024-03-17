package org.example.class4;

public class E1toE3IfElseIf {
    public static void main(String[] args) {
        int age = 10;
        if (age > 18) {
            System.out.println("You can drive");
        } else {
            System.out.println("You need to wait");
        }

        int day = 5;
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Wrong day");
        }

        String name = "Alex";
        if (name.equals("Le")) {
            System.out.println("No");
        } else {
            System.out.println("OK");
        }
    }
}

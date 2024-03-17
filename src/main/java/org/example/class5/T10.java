package org.example.class5;

import java.util.Scanner;

public class T10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month = input.next();
        String season = "";
        if (month.equalsIgnoreCase("december") || month.equalsIgnoreCase("january") || month.equalsIgnoreCase(
                "february")) {
            season = "Winter";
        } else if (month.equalsIgnoreCase("march") || month.equalsIgnoreCase("april") || month.equalsIgnoreCase(
                "may")) {
            season = "Spring";
        } else if (month.equalsIgnoreCase("june") || month.equalsIgnoreCase("july") || month.equalsIgnoreCase(
                "august")) {
            season = "Summer";
        } else if (month.equalsIgnoreCase("september") || month.equalsIgnoreCase("october") || month.equalsIgnoreCase(
                "november")) {
            season = "Fall";
        } else {
            System.out.println("Invalid Input");
        }
        System.out.println("The season you were born in is " + season);
    }
}

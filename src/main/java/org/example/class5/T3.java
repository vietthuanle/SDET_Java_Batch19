package org.example.class5;

import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your city temperature");
        double tempC = (input.nextDouble() - 32) * 5 / 9;
        System.out.println("The temperature in the city is " + tempC + "°C");
    }
}

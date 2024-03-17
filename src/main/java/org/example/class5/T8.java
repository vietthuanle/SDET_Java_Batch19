package org.example.class5;
import java.util.Scanner;

public class T8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        double num = input.nextDouble();
        if (num >= 1 && num <= 10){
            System.out.println(num+" is a small number");
        } else if (num >= 11 && num <= 100) {
            System.out.println(num+" is a medium number");
        } else if (num >= 101 && num <= 1000) {
            System.out.println(num+" is a large number");
        } else if (num < 1 || num > 1000) {
            System.out.println("Number is either too small or too big");
        } else {
            System.out.println("Invalid Input");
        }
    }
}

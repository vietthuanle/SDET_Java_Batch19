package org.example.class5;
import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day number");
        int day = input.nextInt();
        if (day >=1 && day <=5){
            System.out.println("It is a weekday");
        } else if (day==6 || day ==7) {
            System.out.println("It is a weekend");
        } else {
            System.out.println("Invalid Day");
        }
    }
}

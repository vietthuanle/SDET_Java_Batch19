package org.example.class5;
import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height in inches");
        double height = input.nextDouble();
        if (height<60){
            System.out.println("You are short");
        } else if (height >= 60 && height <= 72) {
            System.out.println("You are medium in height");
        } else if (height > 72) {
            System.out.println("You are tall");
        } else {
            System.out.println("Please enter number");
        }
    }
}

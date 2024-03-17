package org.example.class5;
import java.util.Scanner;

public class T9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the current time");
        int time = input.nextInt();
        if (time >= 1 && time <= 11){
            System.out.println("It is the morning time");
        } else if (time >= 12 && time <= 15) {
            System.out.println("It is the afternoon time");
        } else if (time >= 16 && time <= 20) {
            System.out.println("It is the evening time");
        } else if (time >= 21 && time <= 24) {
            System.out.println("It is the night time");
        } else {
            System.out.println("Invalid");
        }
    }
}
